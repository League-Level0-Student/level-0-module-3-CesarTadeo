package elseif;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JOptionPane;

public class AreYouHappy {
	
	public static void main(String[] args) {
	
	String ruhappy = JOptionPane.showInputDialog(null, "Are You Happy");
	
	if (ruhappy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep Doing Whatever You Are Doing");
		System.exit(0);
	}
	
	if (ruhappy.equals("no")) {
		String douwanttobehappy = JOptionPane.showInputDialog("Do you want to be happy");
	
	String douwanttobehappy1 = JOptionPane.showInputDialog("Do you want to be happy");
	
	}
	
	Object douwanttobehappy = null;
	if (douwanttobehappy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Change Something");
	}

	if (douwanttobehappy.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}











}
}
