<h2>Miglayoutの扱い方</h2>

部活向けドキュメント<br>
<br>
MigLayoutは文字列によりレイアウトを指定する、少し変わったレイアウトマネージャです。<br>
初見は複雑に見えますが、それぞれ文字列の意味がわかってしまえばとても柔軟にレイアウトを組むことができます。<br>
自身も使って間もないですが、基本的な部分についてまとめていきます。<br>

＜＜参考資料＞＞


<!-- ↑はてブを貼る↑ -->

<blockquote>

  <ol>
	<li><a href="#a1">コンストラクタ</a></li>
	
	<li><a href="#b1">複数段にコンポーネントを配置（改行）する</a></li>
  </ol>

</blockquote>

<br>
<h3 id="a1">コンストラクタ</h3>

```
<span style="color:red;">MigLayout</span>()
	レイアウトの設定を特にせずインスタンスを生成
<span style="color:red;">MigLayout</span>(String layoutConstraints,
		String colConstraints,
		String rowConstraints)
	上から、レイアウトの設定、列の設定、行の設定でインスタンスを生成
```

<br>
これだけではもちろんわからないので、実際に例示しながら見て行きましょう。<br>

<br>
<h3 id="b1">複数段にコンポーネントを配置（改行）する</h3>

