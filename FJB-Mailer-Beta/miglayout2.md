<br>
<h3>セルのサイズを調整する</h3>

<br>
コンポーネントのサイズ調整はできました。<br>
今度はコンポーネントを乗せるセル自体のサイズを調整します。<br>

```java

	public TestFrame() {

		setSize(600, 400);

		JPanel panel = new JPanel();

		MigLayout layout = new MigLayout(
				"wrap 3", 			// 全体的なレイアウト設定(layoutConstraints)
				"[200][200][200]", 	// 列のセル指定(colConstraints)
				"[100][100][100]"	// 行のセル指定(rowConstraints)
		);
		// パネルにレイアウトのインスタンスを設定
		panel.setLayout(layout);

		// パネルにコンポーネントを追加していく
		panel.add(new JButton("1A"), "");
		panel.add(new JButton("1B"), "");
		panel.add(new JButton("1C"), "");

		panel.add(new JButton("2A"), "");
		panel.add(new JButton("2B"), "");
		panel.add(new JButton("2C"), "");

		panel.add(new JButton("3A"), "");
		panel.add(new JButton("3A"), "");
		panel.add(new JButton("3A"), "");

		// 自身(TestFrame)にパネルを追加する
		this.add(panel);
	}

```

表示例
<img src="" alt="">

<br>
コンストラクタにもある、
<ul>
  <li>layoutConstraints</li>
  <li>colConstraints</li>
  <li>rowConstraints</li>
</ul>
これらを書き換えることで、レイアウトの調整ができます。<br>
