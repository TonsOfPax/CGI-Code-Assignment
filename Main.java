/* Class creates and controls CeilingFan objects created with CeilingFan.java.
 * main method takes keyboard input to control CeilingFan speed and rotateDirection. 
 * Commands to list valid input also added */

import java.util.Scanner;

public class Main {
	//closeFanController is used to determine if the main loop in main() continues or not
	private static boolean closeFanController = false;
	
	public static void main(String[] args) {
		//Scanner to read keyboard input
		Scanner kb = new Scanner(System.in);
		
		//Create CeilingFan object
		CeilingFan fan = new CeilingFan();
		
		//Loops while the boolean closeFanController is false. When turned to true by entering "end", loop ends
		while(!closeFanController) {
			System.out.print("Please enter a command (pull speed, pull rotate, state, help, end): ");
			String input = kb.nextLine();
			//Keyboard input recorded and passed into ControlInput to call desired method
			ControlInput(fan, input);
		}
		//Close scanner
		kb.close();
	}
	
	//Method contains the method calling based on user input in main
	public static void ControlInput (CeilingFan fan, String input) {
		//Switch statement based on input executes associated command
		switch(input){
			//Adjusts the speed variable in class CeilingFan into 1 of 4 states. Returns current Fan details
			case "pull speed":
				fan.pullSpeed();
				break;
			//Adjusts the rotate variable in class CeilingFan. Returns current state
			case "pull rotate":
				fan.pullRotate();
				break;
			//Returns current states of CeilingFan speed and rotate
			case "state":
				fan.getFanState();
				break;
			//Returns help message with command explanations
			case "help":
				System.out.println(Help());
				break;
			//Ends the while loop
			case "end":
				closeFanController = true;
				break;
			//Warning message from incorrect input
			default:
				System.out.println("\nInput not recognized - please try again\n");
		}
	}
	
	public static String Help() {
		return "\n\"pull speed\" will adjust the speed in a cycle of Off, 1, 2, and 3.\n"
				+ "\"pull rotate\" will alternate the fan to spin clockwise or counter-clockwise.\n"
				+ "\"state\" returns the current speed and rotating direction of the Ceiling Fan.\n"
				+ "\"help\" will display this message.\n"
				+ "\"end\" will close the program.\n";
	}

}