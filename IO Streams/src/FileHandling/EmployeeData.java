package FileHandling;

public class EmployeeData{
	
	int id;
	String name;
	double salary;
	String Role;
	public EmployeeData(int id, String name, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Role = role;
		

	}
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", salary=" + salary + ", Role=" + Role + "]";
	}
	
	
	

}
