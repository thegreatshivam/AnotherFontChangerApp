import javax.swing.JFrame;

public class Main extends JFrame {
    public static void main(String[] args) {
        Gui windows = new Gui();
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        windows.setSize(450,300);
    }
}
