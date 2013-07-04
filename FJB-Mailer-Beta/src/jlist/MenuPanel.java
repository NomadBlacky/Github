package jlist;

import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class MenuPanel extends JPanel {
	
	JButton newMail = new JButton("新規作成");
	JButton trush = new JButton("ゴミ箱");
	JButton notSend = new JButton("未送信");
	JButton address = new JButton("アドレス帳");
	JButton option = new JButton("設定");
	JButton newFolder = new JButton("フォルダ作成");

	public MenuPanel() {
		
		this.setLayout(new MigLayout("", "[]20[]20[]20[]20[]20[]", "[grow]"));

		List<JButton> buttons = Arrays.asList(newMail, trush, notSend, address, option, newFolder);
		for (JButton button : buttons) {
			ImageIcon icon = new ImageIcon("data/menuicon.png");
			button.setIcon(icon);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			add(button, "");
		}
		
	}
}
