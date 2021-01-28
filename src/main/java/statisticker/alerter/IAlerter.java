package statisticker.alerter;

public interface IAlerter {

	public boolean emailSent;
	public boolean ledGlows;

	public boolean isEmailSent() {
		return emailSent;
	}

	public void setEmailSent(final boolean emailSent) {
		this.emailSent = emailSent;
	}

	public boolean isLedGlows() {
		return ledGlows;
	}

	public void setLedGlows(final boolean ledGlows) {
		this.ledGlows = ledGlows;
	}

}
