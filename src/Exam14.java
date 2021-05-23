import java.util.ArrayList;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 5;
		float myFloat = myInt;
		System.out.println("myInt=" + myInt);
		System.out.println("myFloat=" + myFloat);
		float newFloat = 5.5f;
		int newInt = (int) newFloat;
		System.out.println("newFloat=" + newFloat);
		System.out.println("newInt=" + newInt);
		int otherInt = 130;
		byte myByte = (byte) otherInt;
		System.out.println("otherInt=" + otherInt);
		System.out.println("myByte=" + myByte);

		Employee ceo = new CEO("Captain", "Marvel", "ceo_pos", 30000);
		Employee dang = new Employee("Dang", "Red", "emp_pos", 10000);
		Programmer prog = new Programmer("Captain", "Marvel", "Programmer", 20000);
		CEO ceo2 = (CEO) ceo;
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		ceo3.hello();
		prog2.hello();
		dang2.hello();

		IWebsiteCreator dangI = new Programmer("Dang", "Red", "Programmer", 10000);
		Programmer dangP = (Programmer) dangI;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		ceo3.orderWebsite(dangI);
		ceo3.orderWebsite(dangP);
		ceo3.orderWebsite(alphaGo);
		ceo3.orderWebsite(alphaGo2);

	}

}
