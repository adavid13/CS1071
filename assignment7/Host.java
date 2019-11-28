/**Represents a host of apps
 * 
 * @author Amir David
 *
 */
public class Host {
	private int maxMem;
	private int maxCPUs;
	private int maxApps;
	private int currentApps;
	private int usedCPUs;
	private int usedMem;
	private App[] apps;
	public App fetchedApp;
	
	public Host(int maxApps, int maxCPUs, int maxMem) {
		this.maxApps = maxApps;
		this.maxCPUs = maxCPUs;
		this.maxMem = maxMem;
		apps = new App[maxApps];
		for(int i=0;i<maxApps;i++) {
			apps[i] = null;
		}
		currentApps = 0;
		usedCPUs = 0;
		usedMem = 0;
		fetchedApp = null;
	}
	
	public boolean addApp(App app) {
		if(app.getCPU_SLO()+usedCPUs>maxCPUs) {
			return false;
		}
		if(app.getMEM_SLO()+usedMem>maxMem) {
			return false;
		}
		if(currentApps==maxApps) {
			return false;
		}
		apps[currentApps] = app;
		currentApps++;
		usedCPUs += app.getCPU_SLO();
		usedMem += app.getMEM_SLO();
		return true;
	}
	
	public boolean removeApp(int id) {
		for(int i=0;i<currentApps;i++) {
			if(apps[i].getID()==id) {
				usedCPUs -= apps[i].getCPU_SLO();
				usedMem -= apps[i].getMEM_SLO();
				apps[i] = apps[currentApps-1];
				currentApps--;
				return true;
			}
		}
		return false;
	}
	
	public int getAvailableCPU() {
		return maxCPUs-usedCPUs;
	}
	public int getAvailableMem() {
		return maxMem-usedMem;
	}
	
	public boolean appFetch(int id) {
		for (int i=0;i<currentApps;i++) {
			if(apps[i].getID()==id) {
				fetchedApp = apps[i];
				return true;
			}
		}
		return false;
	}
}
