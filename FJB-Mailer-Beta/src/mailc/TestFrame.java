package mailc;

import javax.swing.JButton;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

public class TestFrame extends JFrame {
	
	
	public TestFrame() {
		
		getContentPane().setLayout(new MigLayout());
		
		getContentPane().add(new JButton("1A"), "");
		getContentPane().add(new JButton("1B"), "");
		getContentPane().add(new JButton("1C"), "wrap");

		getContentPane().add(new JButton("2A"), "");
		getContentPane().add(new JButton("2B"), "");
		getContentPane().add(new JButton("2C"), "wrap");
		
		getContentPane().add(new JButton("3A"), "");
}

	
	public static void main(String[] args) {
		
	}
}
