/**Represents a cloud of hosts
 * 
 * @author Amir David
 *
 */
public class Cloud {
	private int maxHosts;
	private int currentHosts;
	private Host[] hosts;
	
	public Cloud(int maxHosts) {
		this.maxHosts = maxHosts;
		currentHosts = 0;
		hosts = new Host[maxHosts];
	}
	
	public boolean addHost(Host host) {
		if(currentHosts<maxHosts) {
			hosts[currentHosts++]=host;
			return true;
		}
		return false;
	}
	
	public boolean addApp(App app) {
		for(int i=0;i<currentHosts;i++) {
			if(hosts[i].addApp(app)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean removeApp(int id) {
		for(int i=0;i<currentHosts;i++) {
			if(hosts[i].removeApp(id)) {
				return true;
			}
		}
		return false;
	}
	
	public int getTotalAvailableCPU() {
		int totalFreeCPU = 0;
		for(int i=0;i<currentHosts;i++) {
			totalFreeCPU += hosts[i].getAvailableCPU();
		}
		return totalFreeCPU;
	}
	
	public int getAvailableMem() {
		int totalFreeMem = 0;
		for(int i=0;i<currentHosts;i++) {
			totalFreeMem += hosts[i].getAvailableMem();
		}
		return totalFreeMem;
	}
	
	public boolean migrateApp(int id, Host host) {
		for(int i=0;i<currentHosts;i++) {
			if(hosts[i].appFetch(id)) {
				if(host.addApp(hosts[i].fetchedApp)) {
					hosts[i].removeApp(id);
					return true;
					}
				}
			}
		return false;
	}
}
