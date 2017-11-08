//2017-11-08 KST Family.java
package synchronizedExam;

public class Family extends Thread{
	Toilet toilet;
	String who;
	
	public Family(String name, Toilet t) {
		who  = name;
		toilet = t;
	}
	
	public void run() {
		toilet.use(who);
	}
}
