package livroComoProgramar.capitulo2;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number1;
		int number2;
		int sum;
		System.out.println("enter first integer: ");
		number1 = sc.nextInt();

		System.out.println("enter second integer: ");
		number2 = sc.nextInt();

		sum = number1 + number2;

		System.out.printf("Sum is %d%n", sum);

		sc.close();

	}

}
