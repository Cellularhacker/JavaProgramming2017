//2017-09-20 KST ShapeTest.java
abstract class Shape {
	protected int area;
	
	public abstract void calcArea();
	public void printArea() {
		System.out.println(getName() + "넓이: " + area); 
	}
	
	public abstract String getName();
}

class Square extends Shape {
	private int width, length;
	
	public Square(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public void calcArea() {
		area = width * length;
	}
	public String getName() {
		return "사각형";
	}
	public void printCircum() {
		System.out.println("사각형 둘레: " + (2 * (width + length)));
	}
}

class Triangle extends Shape {
	private int base, height;
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void calcArea() {
		area =  base * height / 2;
	}
	public String getName() {
		return "삼각형";
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Triangle(10, 20);
		shapes[1] = new Square(10, 5);
		shapes[2] = new Square(10, 10);
		shapes[3] = new Triangle(20, 10);
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].calcArea();
			shapes[i].printArea();
			if(shapes[i] instanceof Square)
				((Square) shapes[i]).printCircum();
		}
	}
}