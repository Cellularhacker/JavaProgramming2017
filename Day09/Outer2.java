// 2017-11-01 KST Outer2.java

interface Eatable {
	public void doA();
	public void doB();
}
public class Outer2 {
	String foodName;
	
	public Outer2(String name) {
		foodName = name;
	}
	public void cooking() {
		System.out.println("내부 클래스 생성합시다");
		
		new Eatable() {
			public void doA() {
				System.out.println(foodName + " 익혀먹기");
			}
			public void doB() {
				System.out.println(foodName + " 조림으로 먹기");
			}
		}.doA(); // - Eatable 한 익명객체.doA() 의 의
	}
	
	public static void main(String[] args) {
		Outer2 out = new Outer2("콩나물");
		out.cooking();
	}
}