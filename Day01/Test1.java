//2017-08-16 KST Test1.java
class MethodTest1 {
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public double mul(double a, int b) {
		return a * b;
	}
	public void sub(float a, float b) {
		float result =  a - b;
		System.out.println("결과값=" + result);
	}
}
public class Test1 {
	public static void main(String[] args) {
		MethodTest1 a = new MethodTest1();
		int b = a.add(10, 20);
		System.out.println("덧셈 결과값=" + b);
		System.out.println("덧셈 결과값=" + a.add(10, 20));
		double c = a.mul(2.5, 3);
		System.out.println("곱셈 결과값=" + c);
		System.out.println("곱셈 결과값=" + a.mul(2.5, 3));
		a.sub(2.5f, 1.2f);
		//System.out.println("뺄셈 결과값=" + a.sub(2.5f, 1.2f));
	}
}
