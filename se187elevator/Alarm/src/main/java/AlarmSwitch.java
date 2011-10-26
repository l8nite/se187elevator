import java.awt.event.ActionEvent;

public class AlarmSwitch implements IAlarmSwitch, IAlarmSwitchDelegate {
	private AlarmState alarmState;
	private AlarmSwitchUI alarmSwitchUI;
	private IAlarmSwitchDelegate alarmSwitchDelegate;

	public AlarmSwitch() {
		this(null);
	}

	public AlarmSwitch(IAlarmSwitchDelegate delegate) {
		this.alarmSwitchDelegate = delegate;
		this.setAlarmState(AlarmState.OFF);
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

	public AlarmSwitchUI getAlarmSwitchUI() {
		if (null == alarmSwitchUI) {
			alarmSwitchUI = new AlarmSwitchUI(this);
		}

		return alarmSwitchUI;
	}

	public void setAlarmSwitchUI(AlarmSwitchUI alarmSwitchUI) {
		this.alarmSwitchUI = alarmSwitchUI;
	}

	public void alarmSwitchActivate(ActionEvent e) {
		this.setAlarmState(this.alarmState.toggle());

		System.out.println("Whoa, you clicked on it!");

		if (null != alarmSwitchDelegate) {
			alarmSwitchDelegate.alarmSwitchActivate(e);
		}
	}

	public IAlarmSwitchDelegate getAlarmSwitchDelegate() {
		return alarmSwitchDelegate;
	}

	public void setAlarmSwitchDelegate(IAlarmSwitchDelegate alarmSwitchDelegate) {
		this.alarmSwitchDelegate = alarmSwitchDelegate;
	}
}