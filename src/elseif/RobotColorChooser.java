//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bot = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i=0; i<5;i++) {
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			bot.setPenColor(200, 0, 0);
		}
		
		if (color.equals("blue")) {
			bot.setPenColor(0, 0, 200);
		}
		
		if (color.equals("green")) {
			bot.setPenColor(0, 200, 0);
		}
        //6. If the user doesn’t enter anything, choose a random color
			if (color.equals("")) {
				bot.setPenColor(0, 0, 0);}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bot.setSpeed(500);
		bot.penDown();
		bot.move(200);
		bot.turn(90);
		bot.move(200);
		bot.turn(90);
		bot.move(200);
		bot.turn(90);
		bot.move(200);
		bot.turn(90);	
	}
}
}