public class CanaraBank  extends Bank{
	
	public CanaraBank(String name, int balance, String accNo) {
		super(balance);
		
		this.accNo = accNo;
		this.name = name;
		this.openBalance = balance;
		
	}
	String name;
	String accNo;
	
	
	void deposit(int amt) {
		System.out.println(":::::From Canara Bank::::::");
		super.deposit(amt);
	}
	
	void withDraw(int amt) {
		System.out.println(":::::From Canara Bank::::::");
		super.withDraw(amt);
		
	}
	void checkBalance() {
		System.out.println(":::::From Canara Bank::::::");
		super.checkBalance();
	}

}