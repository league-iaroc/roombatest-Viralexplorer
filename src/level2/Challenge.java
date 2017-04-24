package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	static int speed=5000;
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		
 driveDirect(5000, 5000);
 sleep(1550);
 driveDirect(50, 500);
 sleep(800);
 driveDirect(500,500);
 sleep(4800);
 driveDirect(500, 50);
 sleep(800);
 driveDirect(500,500);
 //give up
 sleep(2000);
	}

	public void loop() {
	
	}
}
