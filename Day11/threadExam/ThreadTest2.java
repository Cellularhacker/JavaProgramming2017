//2017-11-08 KST ThreadTest2.java
package threadExam;

public class ThreadTest2 extends Thread {
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.println("run number = " + i);
		}
	}
	public static void main(String[] args) {
		ThreadTest2 tt = new ThreadTest2();
		tt.start();
		for(int i=101; i<=120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}
}