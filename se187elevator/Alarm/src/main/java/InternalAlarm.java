import javax.swing.JPanel;

public class InternalAlarm implements IAlarm {
	InternalAlarmUI alarmUI = null;

	public JPanel createAlarmUI() {
		alarmUI = new InternalAlarmUI();
		return alarmUI;
	}

}