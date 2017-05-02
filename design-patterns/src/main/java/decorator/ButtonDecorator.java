package decorator;

public abstract class ButtonDecorator extends Button {

	Button button;
	public void setButton(Button button) {
		this.button = button;
	}
	
	@Override
	public void doClick() {
		if(button != null) {
			button.doClick();
		}
	}

}