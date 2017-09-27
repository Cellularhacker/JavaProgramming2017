//2017-09-27 KST ThrowException.java
public class ThrowException {
	public void exceptionMethod() throws ArrayIndexOutOfBoundsException {
		int[] intA = {1, 2, 3, 4};
		for(int i=0; i<10; i++) {
			//Throws Exception.
			if(i == 4) throw new ArrayIndexOutOfBoundsException();
			System.out.println(intA[i]);
		}
	}
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		try {
			te.exceptionMethod();
		} catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("배열의 index를 초과했습니다.");
			ab.printStackTrace();
		}
	}
}
