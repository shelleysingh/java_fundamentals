package java_fundementals;

public class ifElseTest {

	public static void main(String[] args) {
		float salary;
		salary = 3800.50f;
		byte experience;
		experience = 8;
		char department;
		department = 'O';
		byte incrementPercentage;
		if (experience > 2 && department == 'D') {
			incrementPercentage = 10;
			System.out.println("1");

		} else if (experience > 5 && department == 'S') {
			incrementPercentage = 8;
			System.out.println("2");
		} else {
			incrementPercentage = 5;
			System.out.println("3");
		}
		salary = salary + (salary * incrementPercentage / 100);
		System.out.println(salary);

	}

}
