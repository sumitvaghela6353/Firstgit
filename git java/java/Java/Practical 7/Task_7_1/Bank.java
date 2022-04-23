import java.util.*;

class NotEnoughMoneyException extends Exception {
	public NotEnoughMoneyException(String str) {
		super(str);
	}
}

class Bank {
	private String name;
	private float balance;
	
	public Bank () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name: ");
		name = sc.nextLine();
		
		System.out.println("Enter the balance: ");
		balance = sc.nextFloat();
	}
	public void deposit (float amount) {
		System.out.println("The old balance is "+ balance);
		balance = balance + amount;
		System.out.println("The new balance is " + balance);
	}
	
	public void withdraw (float amount) throws NotEnoughMoneyException{
		try {
			if(amount < balance){
				System.out.println("The old balance is " + balance);
				balance = balance - amount;
			}
			if (balance < 500f){
				throw new NotEnoughMoneyException("You don't have enough money to withdraw.");
			}else{
				System.out.println("The new balance is " + balance);
			}
		}
		catch (ArithmeticException e){
			System.out.println(e.toString());
		}
	}
}