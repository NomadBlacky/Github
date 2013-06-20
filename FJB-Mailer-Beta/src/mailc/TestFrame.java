package mailc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class TestFrame extends JFrame {


	public TestFrame() {

		JPanel panel = new JPanel();

		// レイアウトの設定なしでインスタンス生成
		MigLayout layout = new MigLayout("", "", "");
		// パネルにレイアウトのインスタンスを設定
		panel.setLayout(layout);

		// パネルにコンポーネントを追加していく
		panel.add(new JButton("1A"), "");
		panel.add(new JButton("1B"), "");
		panel.add(new JButton("1C"), "wrap"); // wrapで改行

		panel.add(new JButton("2A"), "");
		panel.add(new JButton("2B"), "");
		panel.add(new JButton("2C"), "");
		panel.add(new JButton("2D"), "wrap"); // 改行

		panel.add(new JButton("3A"), "");

		// 自身(TestFrame)にパネルを追加する
		this.add(panel);
	}


	public static void main(String[] args) {

		TestFrame testFrame = new TestFrame();
		testFrame.setSize(400, 300);

		// 画面の中央に表示させる
		testFrame.setLocationRelativeTo(null);
		testFrame.setVisible(true);
	}
}
