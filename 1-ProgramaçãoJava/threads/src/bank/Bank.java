package bank;

public class Bank {

	private double[] accounts;
	
	private Object lock = new Object();

	public Bank(int numAccounts) {
		accounts = new double[numAccounts];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = 1000;

		}
	}

	/*public synchronized void transfer(int from, int to, double amount) { //a chamada desse metodo com syncronized vai colocar as threads na fila do semáforo
		if (accounts[from] < amount) {
			return;

		}
		accounts[from] -= amount;
		accounts[to] += amount;
	}
	*/
	
	public void transfer(int from, int to, double amount) { 
		
		synchronized (lock) { //usando desse jeito, fica menos custoso e mais fácil de 
			if (accounts[from] < amount) {
				return;

			}
			accounts[from] -= amount;
			accounts[to] += amount;
		}
		
	}
	

	public int accountNumber() {
		return accounts.length;
	}
	public double sum() {
		double sum = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i];

		}
		return sum;

	}

}
