package statisticker.alerter;

public class EmailAlert extends IAlerter {
	public boolean emailSent = false;

	@Override
	public void alert() {
		emailSent = true;/*set to true*/
	}
}
