import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlarmIndicatorUI extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField status = null;

	public AlarmIndicatorUI() {
		setLayout(new FlowLayout());

		JLabel label = new JLabel("Alarm");
		add(label);

		status = new JTextField(5);
		status.setEnabled(false);
		add(status);

		this.setAlarmState(AlarmState.OFF);
	}

	public void setAlarmState(AlarmState alarmState) {
		status.setText(alarmState.toString());

		if (AlarmState.OFF == alarmState) {
			status.setBackground(null);
		} else {
			status.setBackground(AlarmConfiguration.getAlarmColor().getJColor());
		}
	}
}
