package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
driveDirect(5000, 5000);
sleep(500);
driveDirect(50,500);
sleep(500);
driveDirect(5000, 5000);
sleep(5000);
driveDirect(500, 50);
sleep(500);
driveDirect(500,500);
	}

	public void loop() {
if (isBumpedRight()){
	driveDirect(50, 500);
	sleep(500);
	driveDirect(500,500);
}

	}
}
