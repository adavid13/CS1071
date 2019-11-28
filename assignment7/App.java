/**Represents an app 
 * 
 * @author Amir David
 *
 */
public class App {
	private static int nextID=0;
	private final int ID;
	private final String NAME;
	private final int MEM_SLO;
	private final int CPU_SLO;
	
	public App(String name, int memory, int cpu) {
		ID = nextID;
		nextID++;
		this.NAME = name;
		this.MEM_SLO = memory;
		this.CPU_SLO = cpu;
	}
	
	public int getID() {
		return ID;		
	}
	public String getNAME() {
		return NAME;
	}
	public int getMEM_SLO() {
		return MEM_SLO;
	}
	public int getCPU_SLO() {
		return CPU_SLO;
	}
}
