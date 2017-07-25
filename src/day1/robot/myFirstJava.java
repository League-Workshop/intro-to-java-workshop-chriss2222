package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class myFirstJava {
	public static void main(String[] args) {
		Robot puttputt = new Robot();
		puttputt.setSpeed(100);
		 puttputt.moveTo(90, 90);
		 puttputt.setPenColor(200,105,106);
	   puttputt.penDown();
		 puttputt.move(-600);
		 puttputt.moveTo(180, 180);
		 puttputt.move(-500);
		 puttputt.turn(-90);
		 puttputt.move(100);
		 puttputt.penUp();
		 puttputt.moveTo(360, 90);
		puttputt.penDown();
		puttputt.hide();
		for (int i = 0; i < 360; i++) {
			puttputt.move(-5);
			puttputt.turn(1);
			
			}

	}
}
