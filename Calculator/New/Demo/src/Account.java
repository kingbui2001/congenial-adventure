
public class Account {
	private String number;
	private double balance;
	private String name;
	
	public Account(String number,String accountOwner) {
		this.number = number;
		this.name = accountOwner;
	}
	public void SetBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double depositAccount) {
		balance = balance +depositAccount;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
