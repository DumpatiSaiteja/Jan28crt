public class BankDemo {

	public static void main(String[] args) {
	Bank bank = null;
	
		bank = 
				new CanaraBank("Shyam",5000,"1236789");
		
		bank.deposit(15000);
		bank.checkBalance();
		bank.withDraw(5000);
		bank.checkBalance();
		
		
		bank = 
				new ICICIBank("Sundar",15000,"875875");
		
		
		bank.deposit(7000);
		bank.checkBalance();
		bank.withDraw(4000);
		bank.checkBalance();
		
		
	}

}