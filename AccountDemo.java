public class AccountDemo
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		Account a2 = new Account(1000);

		System.out.println("Balance in account 1: " + a1.getBalance());
		System.out.println("Balance in account 2: " + a2.getBalance());
 
		System.out.println("Withdrawing from account a1: " + a1.withdraw(5000));
		System.out.println("New Balance: " + a1.getBalance());

		System.out.println("Depositing in accoutn a2: " + a2.deposit(2000));
		System.out.println("New Balance: " + a2.getBalance());

		System.out.println("Comparing accounts a1 and a2.\n1 : Balance in a1 is greater than a2.\n2 : Balance in a1 and a2 is same.\n3 : Balance in a1 is less than a2.");
		System.out.printf("%d \n",a1.compareTo(a2));
	}
}