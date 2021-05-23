
public class CEO extends Employee {

	public CEO(String firstName, String lastName, String position, int salary) {
		super(firstName, lastName, position, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		//super.hello();
		System.out.println("Hi, nice to meet you."+this.getFirstName()+"!");
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()*2;
	}
	public void fire(Employee emp) {
		System.out.println(emp.getFirstName()+" has been fired!");
	}

}
