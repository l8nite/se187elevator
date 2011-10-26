import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlarmIndicatorUI extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField status = null;

	public AlarmIndicatorUI() {
		this(AlarmState.OFF);
	}

	public AlarmIndicatorUI(AlarmState initialState) {
		setLayout(new FlowLayout());

		JLabel label = new JLabel("Alarm");
		add(label);

		status = new JTextField(5);
		status.setEnabled(false);
		add(status);

		this.setAlarmState(initialState);
	}

	public void setAlarmState(AlarmState alarmState) {
		status.setText(alarmState.toString());

		if (AlarmState.OFF == alarmState) {
			status.setBackground(Color.GREEN);
		} else {
			status.setBackground(Color.RED);
		}
	}
}
