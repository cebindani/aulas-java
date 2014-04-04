package aulajava;
import robocode.*;
import java.awt.Color;

/**
 * MyClass - a class by (your name here)
 */
public class DaniRobot extends Robot
{
public void run() {   // açao do Robo
		
		setColors(Color.red,Color.blue,Color.green);
		while(true) {
			
			ahead(100); 
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	
	public void onScannedRobot(ScannedRobotEvent e) { // Quando um robo entrar na mira do seu radar.
	//	fire(5);
		
	}

	public void onHitByBullet(HitByBulletEvent e) {  // Quando seu robo ser atingido por um tiro.
		//turnLeft(90 - e.getBearing());
	}
	
}


// Nada impede de vocês implementarem outros métodos, não é obrigatório usar só estes métodos, criatividade sempre.
