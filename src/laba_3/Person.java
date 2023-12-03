package laba_3;

public class Person {
	private String name;
	Person(String name){
		this.name = name;
	}
	public void tofire(Fired fired) {
		System.out.println(name + " зажёг " + fired.toString());
	}
	public void notofire(Fired fired) {
		System.out.println(name + " потушил " + fired.toString() );
	}
	public void stand() {
		System.out.println(name + " встал" );
	}
	public void drop(Item obj, Item sub) {
		System.out.println(name + " кинул в " + obj.getItem() + " " + sub.getItem());
	}
}
