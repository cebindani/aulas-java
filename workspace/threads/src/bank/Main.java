package bank;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int accounts=10;
		Bank bank = new Bank(accounts);
		Customer[] customers = new Customer[accounts];
		
		for (int i = 0; i < customers.length; i++) {
			customers[i]=new Customer(bank);
			customers[i].start();
		}

	}

}
