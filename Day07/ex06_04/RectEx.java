//2017-09-27 KST ex06_04/RectEx.java
//Ex06-04

package ex06_04;

class Rect {
	int width, height;
	public Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	public boolean equals(Rect p) {
		if(width*height == p.width*p.height) return true;
		else return false;
	}
}

public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3); //Size 6
		Rect b = new Rect(3,2); //Size 6
		Rect c = new Rect(3,4); //Size 12
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}