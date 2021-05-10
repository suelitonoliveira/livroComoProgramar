package capitulo3;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is youer name?");
		String message = String.format(name, "Welcome, %s, to Java Programming!");
		
		JOptionPane.showMessageDialog(null, message);
		

	}

}
