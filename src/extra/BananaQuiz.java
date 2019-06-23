//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("dO yOu lIkE bANaNaS, yEs or n0¿");
		
		
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "yOu aRe cRaZy");
		}
		
		
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if (banana.equals("yes")) {
			String hobby = JOptionPane.showInputDialog("wHaT iS yOuR fAvOrItE hObBy¿");
		
			JOptionPane.showMessageDialog(null, hobby + " iS mUcH bEtTeR wItH bAnAnAs"  );
		}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		else {
			banana.equals("");
		JOptionPane.showMessageDialog(null, "yOu aRe BaNAnAs");
		}
	
	
	
	
	
	}

}
