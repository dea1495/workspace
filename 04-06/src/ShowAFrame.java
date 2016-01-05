import javax.swing.JFrame;

class ShowAFrame {

    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String myTitle = "Java Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(600, 900);
        myFrame.setDefaultCloseOperation
            (JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
