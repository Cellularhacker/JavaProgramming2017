// 2017-11-15 KST ex07_02.java

import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class ex07_02 {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>(); // Pointer객체를 요소로 다루는 벡터 생성
		
		// 3개의  Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); // 인덱스 1의 Point(-5, 20) 객체 삭제
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}