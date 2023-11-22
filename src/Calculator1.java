import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Take User Input Number 1
		System.out.println("Please Enter 1st Number 1");
		double num1 = scanner.nextDouble();
		System.out.println("Please Enter 2nd Number");
		double num2 = scanner.nextDouble();

		System.out.println("Please Enter the Operation to be performed" + "1 for addition, 2 for subtructin");

		double opt1 = scanner.nextDouble();
		if (opt1 == 1) {
			double rst1 = num1 + num2;
			System.out.println(rst1);
		}
		if (opt1 == 2) {
			double rst1 = num1 - num2;
			System.out.println(rst1);

		}

	}

}
