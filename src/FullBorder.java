public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() { // �������͒��g�̗����ɍ��E�̏��蕶����������������
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() { // �s���͒��g�̍s���ɏ㉺�̏��蕶��������������
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) { //�w�肵���s�̓��e
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if (row == 0) { //�g�̏�[
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {  //�g�̉��[
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else { //����ȊO
			return "|" + display.getRowText(row - 1) + "|";
		}

	}

	private String makeLine(char ch, int count) {  //����ch��count�A�������������������
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}

		return buf.toString();

	}
}