//2017-09-27 KST ex06_05/WrapperEx.java
//Ex06_05

package ex06_05;

public class WrapperEx {
	public static void main(String[] args) {
		// Using Character
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) // if character c1 is number -> true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) // if character c1 is English Character -> true
			System.out.println(c1 + "는 숫자");
		
		// Using Integer
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
	
		Integer i = new Integer(28);
		System.out.println(i.doubleValue());
		
		// Using Double
		Double d = new Double(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		// Using Boolean
		boolean b = (4 > 3);	//true
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}
}
