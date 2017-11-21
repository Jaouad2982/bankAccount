//A program with two Classes and one interface. You have the options to get a balance, retrieve a balance, deduct funds,
// check your balance and quit. 
//Jaouad Sarouti A programming lover
package bankaccount;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String answer;
		inter bank = new BankAccount();

		do {
			System.out.println("To deposit Press 1");
			System.out.println("To widthraw Press 2");
			System.out.println("To check your balance press 3");
			System.out.println("To quit Press 4");
			int option = input.nextInt();
			if (option == 1) {
				System.out.println("Enter your deposit amount");
				double depo = input.nextDouble();
				bank.addBalance(depo);
			}
			if (option == 2) {
				System.out.println("Enter the amount you would like to withdraw");
				double width = input.nextDouble();
				bank.deductFunds(width);
			}
			if (option == 3) {
				 bank.retrieveBalance();
			}if(option ==4){
				System.out.println("Thank you for using our program, Have a great day");
			}
			System.out.println("Would you like to add another ask");
			input.nextLine();
			answer = input.nextLine();
		}
		while( answer.startsWith("y"));
		
	}
}
