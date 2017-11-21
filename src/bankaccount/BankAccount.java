//A program with two Classes and one interface. You have the options to get a balance, retrieve a balance, deduct funds,
// check your balance and quit. 
//Jaouad Sarouti A programming lover

package bankaccount;
public class BankAccount implements inter{
	
		private int accountNumber;
		double balance;
		private String name,email,phoneNumber;
		public BankAccount(){
			this.accountNumber=0;
			this.balance=3000;
			this.name=" ";
			this.email=" ";
			this.phoneNumber=" ";
			
		}
		

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void addBalance(double deposit){
			balance = (balance + deposit);
			System.out.println("Your new deposit is " + balance);
		}
		
		public void deductFunds(double withdrawal){
			if (withdrawal > balance){
				System.out.println("You do not have enough money to withdraw this amount");
			}else{
				balance = balance - withdrawal;
				System.out.println("Your withdrawal was successful, your new balance is " + balance);
				
			}
		}
		public void retrieveBalance(){
			System.out.println("Your new balance is " + balance);
		}
		
}

