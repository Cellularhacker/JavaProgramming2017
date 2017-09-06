/*
* 2017-09-06 KST Director.java
* Copyright(c) Cellularhacker
* 
*/ 
class Actor {
	//
	// variables of Actor
	//
	protected String name;
	
	//
	// Constructor of Actor
	//
	public Actor(String name) {
		this.name = name;
	}
	
	//
	// Methods of Actor
	//
	public void act() {
		System.out.println("배우 " + name + "은 연기합니다.");
	}
}

class ActionActor extends Actor{	//Extends the Actor class
	//
	// variables of ActionActor
	//
	protected String technique;
	
	//
	// Constructor of ActionActor
	//
	public ActionActor(String name, String technique) {
		super(name);
		this.technique = technique;
	}
	
	//
	// Methods of ActionActor
	//
	public void practice() {
		System.out.println("액션배우 " + name + "은 " + technique + "를 연습합니다.");
	}
	public void act() {
		System.out.println("액션배우 " + name + "은 액션 연기합니다.");
	}
}

public class Director {
	//
	// variables of Director
	//
	protected Actor actors[];
	protected int numOfActors;
	
	//
	// Constructor of Director
	//
	public Director() {
		actors = new Actor[10];
		numOfActors = 0;
	}
	
	//
	// Methods of Director
	// Casting Methods overloaded
	//
	public void cast(Actor actor) {
		if(numOfActors >= 10) {
			System.out.println("배우를 더 이상 캐스팅 할 수 없습니다.");
			return;
		}
		actors[numOfActors++] = actor;
	}
	public void cast(String name) {
		if(numOfActors >= 10) {
			System.out.println("배우를 더 이상 캐스팅 할 수 없습니다.");
			return;
		}
		actors[numOfActors++] = new Actor(name);
	}
	public void cast(String name, String technique) {
		if(numOfActors >= 10) {
			System.out.println("배우를 더 이상 캐스팅 할 수 없습니다.");
			return;
		}
		actors[numOfActors++] = new ActionActor(name, technique);
	}
	// Directing Method
	public void direct() {
		for(int i=0; i<numOfActors; i++) {
			if(actors[i] instanceof ActionActor)
				((ActionActor)actors[i]).practice();
			actors[i].act();
		}
	}
	
	//
	// <Main> Method
	//
	public static void main(String[] args) {
		Director d = new Director();
		Actor a = new Actor("정우성");
		Actor b = new ActionActor("류승범", "돌려차기");
		// 정우성 캐스팅하기
		d.cast(a);
		// 류승범 캐스팅하기
		d.cast(b);
		// 일반배우 고현정 캐스팅하기
		d.cast("고현정");
		// 발차기 특기를 가진 액션배우 공효진 캐스팅하기
		d.cast("공효진", "발차기");
		// 감독하는 기능 호출
		// 감독하는 메소드
		d.direct();
	}
}