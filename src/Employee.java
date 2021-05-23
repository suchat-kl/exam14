import java.util.ArrayList;

public class Employee implements IWebsiteCreator {
	private String firstName, lastName, position;
	private int salary;ArrayList<IWebsiteCreator> myList;

	@Override
	public void goodMorning() {
		// TODO Auto-generated method stub
		System.out.println("Good Morning..");
	}

	public Employee(String firstName, String lastName) {

		this(firstName, lastName, "unknow", 0);
	}

	public Employee(String firstName, String lastName, String position, int salary) {
		super();
		 myList = new ArrayList<>();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
	}

	public void hello() {
		System.out.println("Hello.." + this.firstName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public void orderWebsite(IWebsiteCreator data) {
		// TODO Auto-generated method stub
		this.myList.add(data);
		
	}

//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

}
