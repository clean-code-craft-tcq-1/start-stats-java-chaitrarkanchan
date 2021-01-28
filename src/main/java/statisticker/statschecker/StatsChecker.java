package statisticker.statschecker;

import java.util.Collections;
import java.util.List;

import statisticker.alerter.IAlerter;

public class StatsChecker {
	public float maxThreshold;
	public IAlerter iAlerter[];

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.iAlerter = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		for (Float number : numbers) {
			if (number > maxThreshold) {
				for (IAlerter iAlerter : alerters) {
					if (alerter instanceof EmailAlert) {
						((EmailAlert) alerter).emailSent = true;
					} else if (alerter instanceof LEDAlert) {
						((LEDAlert) alerter).ledGlows = true;
					}
				}
			}
		}
	}

}
