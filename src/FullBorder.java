public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() { // 文字数は中身の両側に左右の飾り文字分を加えたもの
		// TODO 自動生成されたメソッド・スタブ
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() { // 行数は中身の行数に上下の飾り文字を加えたもの
		// TODO 自動生成されたメソッド・スタブ
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) { //指定した行の内容
		// TODO 自動生成されたメソッド・スタブ
		if (row == 0) { //枠の上端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {  //枠の下端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else { //それ以外
			return "|" + display.getRowText(row - 1) + "|";
		}

	}

	private String makeLine(char ch, int count) {  //文字chをcount個連続させた文字列をつくる
		// TODO 自動生成されたメソッド・スタブ
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}

		return buf.toString();

	}
}
