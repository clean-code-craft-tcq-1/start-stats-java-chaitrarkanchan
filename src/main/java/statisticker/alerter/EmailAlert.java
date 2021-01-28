package statisticker.alerter;

public class EmailAlert implements IAlerter {
	public boolean emailSent = false;

	@Override
	public void sample() {
		emailSent = true;
	}
}
