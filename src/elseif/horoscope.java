package elseif;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String starsign = JOptionPane.showInputDialog("What is your star sign");

		if (starsign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "You are Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		
		}
		
		else if (starsign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}

		else if (starsign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}

		else if (starsign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "You are Emotional, group oriented, seeks security, family.");
		}

		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}























}
}
