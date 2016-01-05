import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

 class JOptonsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        UIManager.put("TextField.font", new Font("Dialog", Font.BOLD,14));
		String username =
        		JOptionPane.showInputDialog("username:");
        String password =
        		JOptionPane.showInputDialog("password:");
        if (
        	    username == null ||
        		password == null )
        	{ 
        		JOptionPane.showMessageDialog(null, "Don't cancel out");
        	}
        else if (
        		(username.equals("dean") &&
        		 password.equals("sandie")) ||
        		(username.equals("hritter") &&
                 password.equals("preeakston")) 
                )
            {
        		JOptionPane.showMessageDialog(null, "Youre In");
            } 
        else {
        	JOptionPane.showMessageDialog(null, "Youre dodgy");
        }
	}
}
