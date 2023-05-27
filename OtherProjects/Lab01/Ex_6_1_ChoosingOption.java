import javax.swing.JOptionPane;

public class Ex_6_1_ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: " 
				+ (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);

		// Answer:
		// - If choose "Cancel", the dialog will return "You've chosen: No" 
		// - If you want to show 2 options, you should use JOptionPane.showOptionDialog:
		String[] options = {"I do", "I don't"}; 
		JOptionPane.showOptionDialog(null,"Do you want to change to the first class ticket?",
		"Choose",
		JOptionPane.DEFAULT_OPTION, 
		JOptionPane.INFORMATION_MESSAGE,
		null,
		options, 
		options[0]); 
	}
}
