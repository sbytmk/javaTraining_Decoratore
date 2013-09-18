public abstract class Border extends Display {
	protected Display display; // この飾り枠がくるんでいる中身を指す

	protected Border(Display display) { //インスタンス生成時に中身を引数で指定
		this.display = display;
	}
}
