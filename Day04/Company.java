//2017-09-06 KST Company.java
class Employee {
	protected String name;
	protected String idnum;
	protected String title;
	protected int salary;
	
	public Employee(String name, String idnum) {
		this.name = name;
		this.idnum = idnum;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void work() {
		System.out.println("\tEmployee \"" + name + "\" does his best.");
	}
}

class Manager extends Employee {
	String dept;
	
	public Manager(String name, String idnum, String dept) {
		super(name, idnum);
		this.dept = dept;
	}
	
	public void work() {
		System.out.println("Manager \"" + name + "\" works hard with his subordinates in "
		+ dept + " dept.");
	}
	
	public void manage() {
		System.out.println("Manager \"" + name + "\" manages his dept.");
	}
}

public class Company {
	private Manager jmchoi, yckim;
	private Employee park, lee;
	private Employee employees[];
	
	public Company() {
		jmchoi = new Manager("Choi Jong Myung", "F99847", "Finance");
		yckim = new Manager("Kim Young Chul", "F99832", "Develope");
		park  = new Employee("park", "F99792");
		lee = new Employee("lee", "F94732");
		
		employees = new Employee[4];
		employees[0] = jmchoi;
		employees[1] = yckim;
		employees[2] = park;
		employees[3] = lee;
	}
	
	public void makeMoney() {
		int n = employees.length;
		for(int i=0; i<n; i++) {
			employees[i].work();
			if(employees[i] instanceof Manager)
				((Manager)employees[i]).manage();
		}
	}
	
	public static void main(String[] args) {
		Company mycom = new Company();
		mycom.makeMoney();
	}
}