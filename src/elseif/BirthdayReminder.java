
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 28th";
		String dadsBirthday = "April 22th";
		String myBirthday = "April 22th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String whosbirthday = JOptionPane.showInputDialog("Who's birthday do you want to find out...dadsBirthday, momsBirthday, or myBirthday");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, whosbirthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (whosbirthday.equals(momsBirthday)) {
			JOptionPane.showMessageDialog(null, "August 28th");
		}
		
	// 5. if user asked for "dad"
			// print dad's birthday
		else if (whosbirthday.equals(dadsBirthday)) {
		JOptionPane.showMessageDialog(null,"April 22th" );
	}
	
		
	// 6. if user asked for your name
			// print myBirthday
	else if (whosbirthday.equals(myBirthday)) {
		JOptionPane.showMessageDialog(null, "April 22th");
	}	
	
		
	//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
	}


} 
}