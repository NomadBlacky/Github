package jlist;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class JList_Test extends JFrame {
	
	private JTextPane textPane;
	
	public JList_Test() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JList_Test");
		setSize(800,600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new MigLayout("", "[][grow]", "[100][grow]"));
		
		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		DefaultListModel<MailObject> model = new DefaultListModel<>();
		
		ArrayList<MailObject> mailList = new ArrayList<>();
		mailList.add(new MailObject("hoge@foo.com", "ほげぇ", new Date(), "本文だよん"));
		mailList.add(new MailObject("moge@ppp.co.jp", "もげぇ", new Date(), "本文\nなのです"));
		mailList.add(new MailObject("poge@feaw.ne.jp", "ぽげぇ", new Date(), "本文\nである"));
		mailList.add(new MailObject("fage@geaw.ac.jp", "ふぁげぇ", new Date(), "本文\n\n\nかもしれない"));
		mailList.add(new MailObject("piyo@pipipi.com", "ぴよ", new Date(), "本文だった", Status.RECEIVE));
		mailList.add(new MailObject("moge@mogeru.com", "もげ", new Date(), "本\n文\nの\nよ\nう\nな\nも\nの\n", Status.SENT));
		mailList.add(new MailObject());
		
		for(MailObject mail : mailList) {
			model.addElement(mail);
		}

		JList<MailObject> jList = new JList<>(model);
		jList.setCellRenderer(new TextImageRenderer());
		jList.addMouseListener(new ListClickAction());
		
		scrollPane.setViewportView(jList);
		
		JPanel menuPanel = new MenuPanel();
		getContentPane().add(menuPanel, "span, center, wrap");
	
		getContentPane().add(scrollPane, "grow");

		textPane = new JTextPane();
		getContentPane().add(textPane, "span,grow");

		setVisible(true);

	}
	
	class ListClickAction extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {

			System.out.println(e.getSource().getClass());
			
			JList<MailObject> list = (JList<MailObject>) e.getSource();
			
			System.out.println(list.getSelectedValue() + "\n");
			
			textPane.setText(list.getSelectedValue().getText());
		}
	}
	
	public static void main(String[] args) {

		JList_Test frame = new JList_Test();
	}

}
