/*Class creates a CeilingFan object. Methods can adjust speed and rotateDirection of the fan. Also able to list current fan values.
 * Used by main method in Main.java */

public class CeilingFan {
	//Variables used with CeilingFan object
	private int speed;
	private boolean rotateClockwise;
	
	//Create a CeilingFan object. Default values are 0 speed and rotating clockwise
	public CeilingFan() {
		speed = 0;
		rotateClockwise = true;
	}
	
	//Increment speed variable, resetting to 0 if speed == 3
	public void pullSpeed() {
		if(speed != 3) {
			speed++;
		}
		else {
			speed = 0;
		}
		getFanState();
	}
	
	//Flip rotateClockwise variable between true and false
	public void pullRotate() {
		if(rotateClockwise) {
			rotateClockwise = false;
		}
		else {
			rotateClockwise = true;
		}
		getFanState();
	}
	
	//Prints the current speed and rotation direction of the fan
	public void getFanState() {
		//Message will denote speed as "Off" rather than 0 when speed == 0
		if(this.speed == 0) {
			System.out.println("\nFan Speed: Off\nRotating Clockwise: " + rotateClockwise + "\n");
		}
		else {
			System.out.println("\nFan Speed: " + speed + "\nRotating Clockwise: " + rotateClockwise + "\n");
		}
	}
}