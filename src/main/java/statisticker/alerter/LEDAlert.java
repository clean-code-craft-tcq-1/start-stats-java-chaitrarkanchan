package statisticker.alerter;

public class LEDAlert extends IAlerter {
  public boolean ledGlows = false;

	@Override
	public void alert() {
		ledGlows = true;
	}

}
