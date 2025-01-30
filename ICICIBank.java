public class ICICIBank  extends Bank{

	String name;
	String accNo;
	public ICICIBank(String name, int balance, String accNo) {
		super(balance);
		
		this.accNo = accNo;
		this.name = name;
		this.openBalance = balance;
		
	}
	
	void deposit(int amt) {
		System.out.println(":::::From ICICI Bank::::::");
		super.deposit(amt);
	}
	
	void withDraw(int amt) {
		System.out.println(":::::From ICICI Bank::::::");
		super.withDraw(amt);
		
	}
	void checkBalance() {
		System.out.println(":::::From ICICI Bank::::::");
		super.checkBalance();
	}



}