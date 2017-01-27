public class Account implements Comparable
{
	private double balance;

	public Account()
	{
		this.balance = 10000;
	}

	public Account(double balance)
	{
		setBalance(balance);
	}

	public double getBalance()
	{
		return this.balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public String deposit(double amount)
	{
		balance = balance + amount;
		return "Deposit Successful";
	}

	public String withdraw(double amount)
	{
		if (amount > getBalance())
			return "Not enough balance in the account";

		else if (amount < getBalance())
			balance = balance - amount;
			return " Withdraw Successful";
	}

	public int compareTo(Object o)
	{
		if (this.getBalance() > ((Account)o).getBalance())
			return 1;
		else if (this.getBalance() == ((Account)o).getBalance())
			return 2;
		else 
			return 3;
	}
}