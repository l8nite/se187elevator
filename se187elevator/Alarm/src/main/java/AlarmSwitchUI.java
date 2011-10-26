import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AlarmSwitchUI extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton alarmButton = null;

	public AlarmSwitchUI(ActionListener listener) {
		setLayout(new FlowLayout());
		alarmButton = new JButton("ALARM");
		alarmButton.setOpaque(true);
		alarmButton.setActionCommand("alarm");
		alarmButton.addActionListener(listener);
		alarmButton.setToolTipText("Click to activate alarm!");
		add(alarmButton);
	}

	public void setAlarmState(AlarmState alarmState) {
		if (AlarmState.OFF == alarmState) {
			alarmButton.setBackground(null);
		} else {
			alarmButton.setBackground(AlarmConfiguration.getAlarmColor().getJColor());
		}
	}
}