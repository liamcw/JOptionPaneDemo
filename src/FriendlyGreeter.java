import javax.swing.JOptionPane;

public class FriendlyGreeter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter name:");

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (m):"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight (Kg):"));
		double bmi = weight / (height*height);

		JOptionPane.showMessageDialog(null, "Hello " + name + "!");
		JOptionPane.showMessageDialog(null, "You are " + age + " and your body mass index is " + bmi + ".");

	}

}
