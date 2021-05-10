package capitulo3;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		
		
		Account account1 = new Account("Jane Green",50.0);
		Account account2 = new Account("Jhon blue",-7.53);
		
		System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Enter deposit amount for account1:  ");
		double depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n",account2.getName(),account2.getBalance());
		
		System.out.println("Enter deposit amount for account2: ");
		depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n",account2.getName(),account2.getBalance());
		
		sc.close();

	}

}
