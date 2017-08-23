//2017-08-23 KST Test2.java
class MethodTest2 {
	int a, b;
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public void sum() {
		int result = a + b;
		System.out.println("덧셈 결과값="+result);
	}
	public void set(int c, int d) {
		a = c; b = d;
	}
	public void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class Test2 {
	public static void main(String[] args) {
		MethodTest2 a = new MethodTest2();
		int b  = a.add(10, 20);
		System.out.println("덧셈 결과값=" + b);
		System.out.println("덧셈 결과값=" + a.add(10, 20));
		System.out.println("a = " + a.a);
		System.out.println("b = " + a.b);
		a.sum();
		a.print();
		a.set(10, 20);
		System.out.println("a = " + a.a);
		System.out.println("b = " + a.b);
		a.sum();
		a.print();
	}
}