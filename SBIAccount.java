
public class SBIAccount {
	String name;
	int acctNo;
	String mobile;
	int balance;

	public SBIAccount(String name, int acctNo, String mobile, int balance) {
		super();
		this.name = name;
		this.acctNo = acctNo;
		this.mobile = mobile;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	int generateAccNo() {
		int max = 5000;
		int min = 500;
		int range = max - min + 1;
		int randNo = (int) (Math.random() * range) + min;
		return randNo;
	}
	@Override
	public String toString() {
		return "SBIAccount [name=" + name + ", acctNo=" + acctNo + ", mobile=" + mobile + ", balance=" + balance + "]";
	}
	void deposite (int amt) {
		this.balance = this.balance + amt;
		System.out.println("successfully deposite ..."+amt);
	}
	void checkBalance() {
		System.out.println("av1 balance---->"+this.balance);
	}
	void withDraw(int amt) {
		if (this.balance > amt) {
				this.balance = this.balance - amt;
				System.out.println("successfully withDraw..."+amt);
		}
				else {
					 System.out.println("Insufficient Balance.....");
				}
		}
}
