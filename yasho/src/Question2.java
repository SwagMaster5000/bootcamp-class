import javax.swing.JOptionPane;
public class Question2 {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "hi " + result + "!");
    }
}