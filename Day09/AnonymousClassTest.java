// 2017-11-01 KST AnonymousClassTest.java

class RemoteControl {
	void turnOn() {}
	void turnOff() {}
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() { //Defining an AnonymousClass
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}
}