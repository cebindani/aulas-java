package threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Beep beep1 = new Beep(1);
		Beep beep2 = new Beep(2);
		Beep beep3 = new Beep(3);
		
		
		beep1.start();
		beep2.start();
		beep3.start();
		
		
		Thread.sleep(5000);
		
		beep1.pare();
		beep1.interrupt(); //faz lançar a exceção InterruptedException
		System.out.println("Fim do main");

	}

}
