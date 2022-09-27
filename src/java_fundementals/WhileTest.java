package java_fundementals;

public class WhileTest {

	public static void main(String[] args) {
		int number = 1;
		while (number <= 1000) {
			if (number % 2 != 0)
				System.out.println(number);
			number++;
		}

	}

}
