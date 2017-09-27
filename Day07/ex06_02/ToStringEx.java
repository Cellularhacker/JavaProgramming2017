//2017-09=27 KST ex06_02/ToString.java
//Ex06-02

package ex06_02;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);
	}
}