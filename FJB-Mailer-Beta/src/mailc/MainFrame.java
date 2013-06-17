package mailc;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		setTitle("FJB Mailer (Sample)");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		ImageIcon icon = new ImageIcon("data/mail_.png");

		ImageIcon icon2 = new ImageIcon("data/mail_.png");

		ImageIcon icon3 = new ImageIcon("data/mail_.png");

		ImageIcon icon4 = new ImageIcon("data/mail_.png");

		ImageIcon icon5 = new ImageIcon("data/mail_.png");

		ImageIcon icon6 = new ImageIcon("data/mail_.png");

		ImageIcon icon7 = new ImageIcon("data/mail_.png");

		ImageIcon icon8 = new ImageIcon("data/mail_.png");

		ImageIcon icon9 = new ImageIcon("data/mail_.png");


		
		DefaultTableModel model = new DefaultTableModel(5, 5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane);
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("メインメニュー", null, panel, null);
		panel.setLayout(new MigLayout("wrap 3", "[grow]", "[grow]"));
		JButton button1 = new JButton("Menu01", icon);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button1, "c");
		JButton button2 = new JButton("Menu02", icon2);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button2, "c");
		JButton button3 = new JButton("Menu03", icon3);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button3, "c");
		JButton button4 = new JButton("Menu04", icon4);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button4, "c");
		JButton button5 = new JButton("Menu05", icon5);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button5, "c");
		JButton button6 = new JButton("Menu06", icon6);
		button6.setHorizontalTextPosition(JButton.CENTER);
		button6.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button6, "c");
		JButton button7 = new JButton("Menu07", icon7);
		button7.setHorizontalTextPosition(JButton.CENTER);
		button7.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button7, "c");
		JButton button8 = new JButton("Menu08", icon8);
		button8.setHorizontalTextPosition(JButton.CENTER);
		button8.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button8, "c");
		JButton button9 = new JButton("Menu09", icon9);
		button9.setHorizontalTextPosition(JButton.CENTER);
		button9.setVerticalTextPosition(JButton.BOTTOM);
		panel.add(button9, "c");
		
		JPanel panelSend = new JPanel();
		tabbedPane.addTab("メール送信", null, panelSend, null);
		panelSend.setLayout(new MigLayout("", "[50,right][grow]", "[][][][][grow]"));
		
		panelSend.add(new JLabel("To:"), "");
		panelSend.add(new JTextField(), "wrap,grow");
		panelSend.add(new JLabel("Cc:"), "");
		panelSend.add(new JTextField(), "wrap,grow");
		panelSend.add(new JLabel("Bcc:"), "");
		panelSend.add(new JTextField(), "wrap,grow");
		panelSend.add(new JLabel("Subject:"), "");
		panelSend.add(new JTextField(), "wrap,grow");
		panelSend.add(new JTextPane(), "h 100::, w 200::, span, c");
		
	}

	public static void main(String[] args) {
		
		MainFrame frame = new MainFrame();
		frame.setSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
