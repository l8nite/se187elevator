import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AlarmSwitchUI extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton alarmButton = null;
	private IAlarmSwitchDelegate delegate = null;

	public AlarmSwitchUI(IAlarmSwitchDelegate delegate) {
		this.delegate = delegate;

		setLayout(new FlowLayout());
		alarmButton = new JButton("ALARM");
		alarmButton.setOpaque(true);
		alarmButton.setActionCommand("alarm");
		alarmButton.addActionListener(this);
		alarmButton.setToolTipText("Click to activate alarm!");
		add(alarmButton);
	}

	public IAlarmSwitchDelegate getDelegate() {
		return delegate;
	}

	public void setDelegate(IAlarmSwitchDelegate delegate) {
		this.delegate = delegate;
	}

	public void setAlarmState(AlarmState alarmState) {
		if (AlarmState.OFF == alarmState) {
			alarmButton.setBackground(null);
		}
		else {
			alarmButton.setBackground(Color.RED);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if ("alarm".equals(e.getActionCommand())) {
			if (null != delegate) {
				delegate.alarmSwitchActivate(e);
			}
		}
	}
}