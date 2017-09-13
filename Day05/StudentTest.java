//2017-09-13 KST StudentTest.java
class Student {
	private String name;
	private String id;
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "이름=" + name + ", 학번=" + id;
	}
	public boolean equals(Object obj) {
		boolean ok = false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(name.equals(s.getName()) && id.equals(s.getId()))
				ok = true;
			else
				ok = false;
		}
		
		return ok;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "1111");
		Student s2 = new Student("홍길동", "1111");
		if(s1.equals(s2))
			System.out.println("같은 학생" + s1);
		s1.setName("홍길순");
		if(s1.equals(s2))
			System.out.println("같은 학생" + s1);
	}
}