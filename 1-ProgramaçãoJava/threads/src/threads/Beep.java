package threads;

public class Beep extends Thread {

	private int num;
	
	private boolean stop;

	public Beep(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (stop) {
				break;
			}
			System.out.println("Beep "+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
	
	public void pare(){
		stop=true;
	}

}
