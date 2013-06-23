package mailc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class TestFrame extends JFrame {


	public TestFrame() {

		setSize(640, 480);

		JPanel panel = new JPanel();

		// レイアウトの設定なしでインスタンス生成
		MigLayout layout = new MigLayout(
				"", 		// レイアウト設定
				"[200][200][200]", 	// 列の指定(colConstraints)
				"[200][200][200]"	// 行の指定(rowConstraints)
		);
		// パネルにレイアウトのインスタンスを設定
		panel.setLayout(layout);
		
		String prop = "";

		// パネルにコンポーネントを追加していく
		panel.add(new JButton("1A"), prop);
		panel.add(new JButton("1B"), prop);
		panel.add(new JButton("1C"), prop + "wrap"); // wrapで改行

		panel.add(new JButton("2A"), prop);
		panel.add(new JButton("2B"), prop);
		panel.add(new JButton("2C"), prop + "wrap");

		panel.add(new JButton("3A"), prop);
		panel.add(new JButton("3A"), prop);
		panel.add(new JButton("3A"), prop + "wrap");

		// 自身(TestFrame)にパネルを追加する
		this.add(panel);
	}


	public static void main(String[] args) {

		TestFrame testFrame = new TestFrame();

		// 画面の中央に表示させる
		testFrame.setLocationRelativeTo(null);
		testFrame.setVisible(true);
	}
}
