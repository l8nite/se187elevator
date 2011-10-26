import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlarmSwitch implements IAlarmSwitch, ActionListener {
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

	public void actionPerformed(ActionEvent e) {
		if ("alarm".equals(e.getActionCommand())) {
			alarmState = alarmState.toggle();
			
			if (null != this.alarmSwitchUI) {
				alarmSwitchUI.setAlarmState(alarmState);
			}

			if (null != alarmSwitchDelegate) {
				alarmSwitchDelegate.alarmSwitchActivate(alarmState);
			}
		}
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

	public IAlarmSwitchDelegate getAlarmSwitchDelegate() {
		return alarmSwitchDelegate;
	}

	public void setAlarmSwitchDelegate(IAlarmSwitchDelegate alarmSwitchDelegate) {
		this.alarmSwitchDelegate = alarmSwitchDelegate;
	}
}