public class AlarmIndicator implements IAlarmIndicator {
	private AlarmState alarmState;
	private AlarmIndicatorUI alarmIndicatorUI;
	
	public AlarmIndicator() {
		this.setAlarmState(AlarmState.OFF);
	}

	public AlarmIndicatorUI getAlarmIndicatorUI() {
		if (null == alarmIndicatorUI) {
			alarmIndicatorUI = new AlarmIndicatorUI();
		}
	
		return alarmIndicatorUI;
	}

	public void setAlarmIndicatorUI(AlarmIndicatorUI alarmUI) {
		this.alarmIndicatorUI = alarmUI;
	}

	public AlarmState getAlarmState() {
		return alarmState;
	}
	
	public void setAlarmState(AlarmState alarmState) {
		this.alarmState = alarmState;
		
		if (null != alarmIndicatorUI) {
			this.alarmIndicatorUI.setAlarmState(alarmState);
		}
	}
}
