//2017-09-06 KST AnimalTest.java

class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("음식을 날것으로 먹습니다.");
	}
	public void eat(String food) {
		System.out.println(food + "을(를) 날것으로 먹습니다.");
	}
	public void breathe() {
		System.out.println("숨쉽니다.");
	}
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

class Person extends Animal {
	private String name;
	
	public Person(int age, String name) {
		super(age);
		this.name = name;
	}
	
	public void eat() {
		System.out.println("음식을 익혀서 먹습니다.");
	}
	public void eat(String food) {
		System.out.println(food + "을(를) 익혀서 먹습니다.");
	}
	public void breathe() {
		System.out.println("허파로 숨쉽니다.");
	}
	public void walk() {
		System.out.println("직립보행을 합니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal(2);
		a.eat();a.eat("고기");
		a.breathe();
		a.sleep();
		Person p = new Person(10, "홍길동");
		p.eat();
		p.eat("고기");
		p.breathe();
		p.sleep();
		p.walk();
		Animal b = new Person(20, "사오정");
		b.eat();
		b.eat("고기");
		b.breathe();
		b.sleep();
		//b.walk()
		((Person)b).walk();
		
		if(b instanceof Person)
			((Person)b).walk();
	}
}