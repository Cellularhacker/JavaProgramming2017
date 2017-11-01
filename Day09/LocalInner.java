// 2017-11-01 KST LocalInner.java

public class LocalInner {
	private String name = "LocalInner";
	
	public void print() {
		final int a = 10;
		
		class Inner {
			public void print() {
				System.out.println(name);
				System.out.println(a);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		LocalInner test = new LocalInner();
		test.print();
	}
}