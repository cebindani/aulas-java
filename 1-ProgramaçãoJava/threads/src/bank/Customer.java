package bank;

public class Customer extends Thread {

	private Bank bank;

	public Customer(Bank b) {

		this.bank = b;
	}

	public void run() {
		int count = 0;
		while (true) {

			int from = (int) (Math.random() * bank.accountNumber());
			int to = (int) (Math.random() * bank.accountNumber());

			double amount = Math.random() * 200;
			bank.transfer(from, to, amount);

			if (count % 100 == 0) {
				System.out.println("Bank sum: " + bank.sum());
			}
		}
	}

}
