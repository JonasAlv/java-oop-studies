package school;

public class School {

	public static void main(String[] args) {
		
		var jonas = new Student();
		jonas.setName("Jonas");
		jonas.setAge(25);
		
		System.out.println("Student " + jonas.getName() + " is " + jonas.getAge());
	}
}
