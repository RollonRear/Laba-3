package laba_3;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Карлсон");
		Fire fire = new Fire("Огонь");
		Log log = new Log(2, "полено");
		log.setSize(" больших ");
		log.setTypeTree(TypeTree.BIRCH);
		ComeIn comin = new ComeIn ("камин");
		Room room = new Room("комната");
		Lamp lamp = new Lamp("Керосиновая лампа");
		Light light = new Light("свет");
		light.setProp("теплым, живым");
		Things things= new Things("вещи");
		Workbench workbench = new Workbench("верстак");
		Roof roof = new Roof("потолок");
		
		
		person.stand();
		person.drop(fire, log);
		System.out.print("Когда ");
		comin.nofire();
		room.unshining();
		person.tofire(lamp);
		lamp.hanging(roof, workbench);
		lamp.shine(light, room);
		lamp.shine(light, things);
		things.wallow(workbench);
		
		
		
	}

}
