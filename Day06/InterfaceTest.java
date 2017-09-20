//2017-09-20 KST InterfaceTest.java
interface Flyable {
	public void fly();
}

interface Singable {
	public void sing();
}

class Person implements Flyable, Singable {
	public void fly() {
		System.out.println("사람이 팔벌려 날아다닙니다.");
	}
	public void sing() {
		System.out.println("사람이 노래를 부릅니다.");
	}
	public void walk() {
		System.out.println("사람이 걷습니다.");
	}
}

class Fish implements Flyable {
	public void fly() {
		System.out.println("물고기가 지느러미를 이용해 날아다닙니다.");
	}
	public void swim() {
		System.out.println("물고기가 헤엄칩니다.");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Fish f1 = new Fish();
		Flyable[] flys = {p1, f1};

		for(int i=0; i<flys.length; i++) {
			flys[i].fly();
			if(flys[i] instanceof Person)
				((Person) flys[i]).walk();
			if(flys[i] instanceof Fish)
				((Fish)flys[i]).swim();
		}
	}
}