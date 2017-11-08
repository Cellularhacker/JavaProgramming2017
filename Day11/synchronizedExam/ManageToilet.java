//2017-11-08 KST ManageToilet.java
package synchronizedExam;

public class ManageToilet {
	public static void main(String[] args) {
		Toilet t = new Toilet();
		
		Family father = new Family("아버지", t);
		Family mother = new Family("어머니", t);
		Family sister = new Family("누나", t);
		Family brother = new Family("형", t);
		Family me = new Family("나", t);
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}