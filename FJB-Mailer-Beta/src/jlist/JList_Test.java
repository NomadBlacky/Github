package jlist;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
		getContentPane().setLayout(new MigLayout("", "[200][grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		DefaultListModel<MailObject> model = new DefaultListModel<>();
		
		ArrayList<MailObject> mailList = new ArrayList<>();
		mailList.add(new MailObject("hoge@foo.com", "ほげぇ", new Date(), "本文だよん"));
		mailList.add(new MailObject("moge@ppp.co.jp", "もげぇ", new Date(), "本文\nなのです"));
		mailList.add(new MailObject("poge@feaw.ne.jp", "ぽげぇ", new Date(), "本文\nである"));
		mailList.add(new MailObject("fage@geaw.ac.jp", "ふぁげぇ", new Date(), "本文\n\n\nかもしれない"));
		mailList.add(new MailObject());
		
		for(MailObject mail : mailList) {
			model.addElement(mail);
		}

		JList<MailObject> jList = new JList<>(model);
		jList.setCellRenderer(new TextAreaRenderer());
		jList.addMouseListener(new ListClickAction());
		
		scrollPane.setViewportView(jList);

		getContentPane().add(scrollPane, "grow");

		textPane = new JTextPane();
		getContentPane().add(textPane, "grow");

		setVisible(true);

	}
	
	class ListClickAction implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		
		@Override
		public void mousePressed(MouseEvent e) {

			System.out.println(e.getSource().getClass());
			
			JList<MailObject> list = (JList<MailObject>) e.getSource();
			
			System.out.println(list.getSelectedValue() + "\n");
			
			textPane.setText(list.getSelectedValue().getText());
		}

		
		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}
	
	public static void main(String[] args) {

		JList_Test frame = new JList_Test();
	}

}
