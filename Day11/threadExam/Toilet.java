//2017-11-08 KST Toilet.java
package threadExam;

public class Toilet {
	public synchronized void use(String name) {
		System.out.println(name);
	}
}
