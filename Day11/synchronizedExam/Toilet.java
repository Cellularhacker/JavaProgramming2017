//2017-11-08 KST Toilet.java
package synchronizedExam;

public class Toilet {
	public synchronized void use(String name) {
		System.out.println(name);
		usingTime();
		System.out.println("아~~~~! 시원해");
	}
	
	public void usingTime() {
		for(int i=0; i< 100000000; i++) {
			if(i == 10000) {
				System.out.println("끄으응");
			}
		}
	}
}