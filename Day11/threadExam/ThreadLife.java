//2017-11-08 KST ThreadLife.java
package threadExam;

public class ThreadLife implements Runnable{
	public void run() {
		for(int i=1; i<21; i++) {
			//Thread의 이름과 정수 출력
			System.out.println(Thread.currentThread().getName() + "number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();
		
		//첫번째 Thread 생성
		Thread first = new Thread(tl, "fitst");
		//두번째 Thread 생성
		Thread second = new Thread(tl, "second");
		//세번째 Thread 생성
		Thread third = new Thread(tl, "third");
		
		second.start();
		first.start();
		third.start();
	}
}