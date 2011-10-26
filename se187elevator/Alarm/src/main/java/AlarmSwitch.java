import java.awt.event.ActionEvent;

public class AlarmSwitch implements IAlarmSwitch, IAlarmState,
		IAlarmSwitchDelegate {
	private AlarmState alarmState;
	private AlarmSwitchUI alarmSwitchUI;
	private IAlarmSwitchDelegate delegate;

	public AlarmSwitch() {
		this(null);
	}

	public AlarmSwitch(IAlarmSwitchDelegate delegate) {
		this.delegate = delegate;
		this.setAlarmState(AlarmState.OFF);
	}

	public AlarmSwitchUI getAlarmSwitchUI() {
		if (null == alarmSwitchUI) {
			alarmSwitchUI = new AlarmSwitchUI(this);
		}

		return alarmSwitchUI;
	}

	public void setAlarmSwitchUI(AlarmSwitchUI alarmSwitchUI) {
		this.alarmSwitchUI = alarmSwitchUI;
	}

	public AlarmState getAlarmState() {
		return alarmState;
	}

	public void setAlarmState(AlarmState alarmState) {
		this.alarmState = alarmState;

		if (null != this.alarmSwitchUI) {
			this.alarmSwitchUI.setAlarmState(alarmState);
		}
	}

	public void alarmSwitchActivate(ActionEvent e) {
		this.setAlarmState(this.alarmState.toggle());

		System.out.println("Whoa, you clicked on it!");

		if (null != delegate) {
			delegate.alarmSwitchActivate(e);
		}
	}
}