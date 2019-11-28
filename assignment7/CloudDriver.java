
public class CloudDriver {

	public static void main(String[] args) {
		App app1 = new App("word",2,4);
		App app2 = new App("Eclipse",4,3);
		App app3 = new App("Chrome",1,1);
		App app4 = new App("Spotify",2,1);
		App app5 = new App("Steam",4,4);
		App app6 = new App("Ccleaner",2,2);
		App app7 = new App("Far Cry 5",7,5);
		App app8 = new App("Fortnite",4,2);
		App app9 = new App("iTunes",3,1);
		App app10 = new App("Adobe AfterEffects",12,10);
		System.out.println("------ Apps demonstration: ------");
		System.out.println("App1 id: "+app1.getID()+" App1 name: "+app1.getNAME()+" App1 memory: "+app1.getMEM_SLO()+" App1 cpu: "+app1.getCPU_SLO());
		System.out.println("App10 id: "+app10.getID()+" App10 name: "+app10.getNAME()+" App10 memory: "+app10.getMEM_SLO()+" App10 cpu: "+app10.getCPU_SLO());
		
		Host host1 = new Host(5,8,12);
		Host host2 = new Host(8,16,32);
		Host host3 = new Host(10,100,80);
		Host host4 = new Host(3,5,4);
		System.out.println("\n----- Hosts demonstration: -----");
		System.out.println("host1 avail mem "+host1.getAvailableMem()+" host1 avail cpu "+host1.getAvailableCPU());
		host1.addApp(app2);
		System.out.println("host1 avail mem "+host1.getAvailableMem()+" host1 avail cpu "+host1.getAvailableCPU());
		host1.addApp(app4);
		System.out.println("host1 avail mem "+host1.getAvailableMem()+" host1 avail cpu "+host1.getAvailableCPU());
		host1.addApp(app7);
		System.out.println("host1 avail mem "+host1.getAvailableMem()+" host1 avail cpu "+host1.getAvailableCPU());
		host1.removeApp(1);
		System.out.println("host1 avail mem "+host1.getAvailableMem()+" host1 avail cpu "+host1.getAvailableCPU());
		
		System.out.println("\n------ Cloud demonstration: -------");
		Cloud myCloud = new Cloud(8);//creating cloud and adding hosts
		myCloud.addHost(host1);
		myCloud.addHost(host2);
		myCloud.addHost(host3);
		myCloud.addHost(host4);
		System.out.println("\ncloud avail mem: "+myCloud.getAvailableMem()+" cloud avail cpu: "+myCloud.getTotalAvailableCPU());
		
		myCloud.addApp(app10);//adding of a big app
		System.out.println("\nhost2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		System.out.println("cloud avail mem: "+myCloud.getAvailableMem()+" cloud avail cpu: "+myCloud.getTotalAvailableCPU());
		
		myCloud.removeApp(9);//successful removal of app
		System.out.println("\nhost2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		System.out.println("cloud avail mem: "+myCloud.getAvailableMem()+" cloud avail cpu: "+myCloud.getTotalAvailableCPU());

		myCloud.addApp(app10);//adding a large app to test migration
		System.out.println("\ncloud avail mem: "+myCloud.getAvailableMem()+" cloud avail cpu: "+myCloud.getTotalAvailableCPU());
		System.out.println("host2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		System.out.println("host3 avail cpu "+host3.getAvailableCPU()+" host3 avail mem "+host3.getAvailableMem());
		
		myCloud.migrateApp(9, host3);//successful migration of a big app
		System.out.println("\nhost2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		System.out.println("host3 avail cpu "+host3.getAvailableCPU()+" host3 avail mem "+host3.getAvailableMem());
		System.out.println("cloud avail mem: "+myCloud.getAvailableMem()+" cloud avail cpu: "+myCloud.getTotalAvailableCPU());
		
		myCloud.addApp(app1);//adding to the first available host
		myCloud.addApp(app2);
		myCloud.addApp(app3);
		myCloud.addApp(app5);
		myCloud.addApp(app6);
		myCloud.addApp(app8);
		myCloud.addApp(app9);
		System.out.println("\nhost1 avail cpu "+host1.getAvailableCPU()+" host1 avail mem "+host1.getAvailableMem());
		System.out.println("host2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		
		myCloud.migrateApp(0, host2);//successful migration
		System.out.println("\nhost1 avail cpu "+host1.getAvailableCPU()+" host1 avail mem "+host1.getAvailableMem());
		System.out.println("host2 avail cpu "+host2.getAvailableCPU()+" host2 avail mem "+host2.getAvailableMem());
		
		System.out.println("\nhost3 avail cpu "+host3.getAvailableCPU()+" host3 avail mem "+host3.getAvailableMem());
		myCloud.migrateApp(9, host1);//too big
		System.out.println("host1 avail cpu "+host1.getAvailableCPU()+" host1 avail mem "+host1.getAvailableMem());
		System.out.println("host3 avail cpu "+host3.getAvailableCPU()+" host3 avail mem "+host3.getAvailableMem());
	}
	

}
