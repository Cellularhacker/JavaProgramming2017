//2017-09-20 Dog.java
class Animal {
	String food = "빵";
	
	public void eat() {
		System.out.println(food + "를 먹다");
	}
	public void bark() {
		System.out.println("짖다");
	}
}

interface Swimmable {
	String pool = "강";
	public void swim();
}

interface Runnable {
	final static int MAXSPEED = 50;
	int MINSPEED = 10;	// Automatically "final static" in a interface.
	
	public void start();
	public void running();
	public void stop();
}

public class Dog extends Animal implements Swimmable, Runnable {

	// Overriding the methods in interface-Run.
	public void start() {
		System.out.println("Dog 출발했다");
	}
	public void running() {
		System.out.println("Dog 달리는 중이다");
	}
	public void stop() {
		System.out.println("Dog 뼈다구를보고 멈추다");
	}
	// Overriding the method in interface-Swim
	public void swim() {
		System.out.println("Dog이 " + pool + "을 네다리로 헤엄치고 있다");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		// Calling the methods in Animal Class.
		d.food = "고기";
		d.eat();
		d.bark();
		// Calling the methods overrided on Run interface.
		d.start();
		d.running();
		d.start();
		// Calling the method overrided on Swim interface.
		d.swim();
		
		Animal a = new Dog();
		a.food = "고기";
		a.eat();
		a.bark();
		((Swimmable)a).swim();
		((Runnable)a).start();
		((Runnable)a).running();
		((Runnable)a).stop();
		
		Runnable r = new Dog();
		((Animal)r).food = "밥";
		((Animal)r).eat();
		((Animal)r).bark();
		((Swimmable)r).swim();
		r.start();
		r.running();
		r.stop();
		
		Swimmable s = new Dog();
		((Animal)s).food = "생선";
		((Animal)s).eat();
		((Animal)s).bark();
		s.swim();
		((Runnable)s).start();
		((Runnable)s).running();
		((Runnable)s).stop();
	}
}