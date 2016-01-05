import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;

 class DummiesPanel extends JPanel {
	 private static final long serialVersionUID = 1L;
	 public void paint (Graphics myGraphics) {
		 myGraphics.drawRect(50, 60, 225, 75);
		 myGraphics.setFont(new Font ("Dialog",Font.BOLD,24));
		 myGraphics.drawString("Java for Dummies", 55, 100) ;
	 }

}
