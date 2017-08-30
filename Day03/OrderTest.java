//2017-08-30 KST OrderTest.java
class Chef {
	private String name;
	
	public Chef(String name) {
		this.name = name;
	}
	public String cook(String food) {
		System.out.println("주방장 " + name + "가 " + food + "를 요리합니다.");
		return food;
	}
}

class Server {
	private String name;
	private Chef chef;
	
	public Server(String name, Chef chef) {
		this.name = name; this.chef = chef;
	}
	public String serve(String foodName) {
		System.out.println("서버 " + name + "가 " + foodName + "을 주방에 요청합니다.");
		String food = chef.cook(foodName);
		System.out.println("서버 " + name + "가 " + foodName + "을 주방장으로 부터 받았습니다.");
		
		return food;
	}
}

class Customer {
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	public String order(Server server, String food) {
		System.out.println("고객 " + name + "가 " + food + "를 주문합니다.");
		String f = server.serve(food);
		System.out.println("고객 " + name + "가 " + food + "를 서버로부터 받았습니다.");
		
		return f;
	}
	public String getName() {
		return name;
	}
}

public class OrderTest {	
	public static void main(String[] args) {
		Chef ch = new Chef("최주방");
		Server s = new Server("왕서버", ch);
		Customer c = new Customer("김고객");
		String food = c.order(s, "낚지볶음");
		System.out.println("고객 " + c.getName() + "가 " + food + "를 맛있게 먹습니다.");

	}
}