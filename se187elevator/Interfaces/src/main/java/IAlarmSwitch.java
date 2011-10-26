import javax.swing.JPanel;

public interface IAlarmSwitch extends IAlarmDisplay {
	public JPanel getAlarmSwitchUI();
	
	public IAlarmSwitchDelegate getAlarmSwitchDelegate();
	public void setAlarmSwitchDelegate(IAlarmSwitchDelegate alarmSwitchDelegate);
}