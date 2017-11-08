//2017-11-08 KST ThreadPriorityControl.java
package threadExam;

public class ThreadPriorityControl implements Runnable {
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriorityControl tl = new ThreadPriorityControl();
		
		Thread first = new Thread(tl, "first");
		first.setPriority(Thread.MAX_PRIORITY);
		System.out.println("first priority = " + first.getPriority());

		Thread second = new Thread(tl, "second");
		first.setPriority(Thread.NORM_PRIORITY);
		System.out.println("first priority = " + first.getPriority());
		Thread third = new Thread(tl, "third");
		first.setPriority(Thread.MIN_PRIORITY);
		System.out.println("first priority = " + first.getPriority());
		
		first.start();
		second.start();
		third.start();
	}
}