import javax.swing.JOptionPane;

public class HW05PartC {
    

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("What is your first name?");
        String firstNumber = JOptionPane.showInputDialog("Enter your favorite number");
        String secondNumber = JOptionPane.showInputDialog("Enter your second favorite number");

        double a = Double.parseDouble(firstNumber);
        double b = Double.parseDouble(secondNumber);

        double product = a * b;

        JOptionPane.showMessageDialog(null, "Hey " + name + ", the product of your two favorite numbers is " + product + "!");
    }
}
