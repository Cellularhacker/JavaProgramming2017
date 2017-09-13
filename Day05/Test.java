//2017-09-13 KST Test.java
public class Test {
	int a;
	Test(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(10);
		if(t1.equals(t2))
			System.out.println("같음1");
		Test t3 = t1;
		if(t1 == t3)
			System.out.println("같음2");
		if(t1.equals(t3))
			System.out.println("같음3");
	}
}