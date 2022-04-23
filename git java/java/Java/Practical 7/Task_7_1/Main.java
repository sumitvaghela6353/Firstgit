class Main {
	public static void main(String args[]){
		Bank b = new Bank();
		b.deposit(200);
		try{
			b.withdraw(500);
		}catch(NotEnoughMoneyException e){
			System.out.println("The exception is caught.");
		}
	}
}