
public class Programmer extends Employee {

	public Programmer(String firstName, String lastName, String position, int salary) {
		super(firstName, lastName, position, salary);
		// TODO Auto-generated constructor stub
		super.getSalary();
	}
	
	public Programmer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void createWebsite(String template, String titleName) {
		System.out.println("template is " + template + " title is " + titleName);
	}

	public void installWindows(String version, String productKey) {
		System.out.println("version is " + version + " productKey is " + productKey);
	}
}
