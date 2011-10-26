public enum AlarmState {
	ON("On"), OFF("Off");

	private final String display;

	private AlarmState(String s) {
		display = s;
	}
	
	public AlarmState toggle() {
		if (AlarmState.ON == this) {
			return AlarmState.OFF;
		}
		else {
			return AlarmState.ON;
		}
	}

	@Override
	public String toString() {
		return display;
	}
};