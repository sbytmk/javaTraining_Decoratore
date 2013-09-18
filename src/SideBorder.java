public class SideBorder extends Border {
	private char borderChar; // ����ƂȂ镶��

	public SideBorder(Display display, char ch) { // �R���X�g���N�^��Display�Ə��蕶�����w��
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() { // �������͒��g�̗����ɏ��蕶����������������
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() { // �s���͒��g�̍s���ɓ���
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return display.getRows();
	}

	@Override
	public String getRowText(int row) { // �w��s�̓��e�́A���g�̎w��s�̗����ɏ��蕶������������
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return borderChar + display.getRowText(row) + borderChar;
	}
}
