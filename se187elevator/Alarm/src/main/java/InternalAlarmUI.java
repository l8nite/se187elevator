import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InternalAlarmUI extends JPanel {

	private static final long serialVersionUID = -5782695485877879488L;

	JTextField textStatus = null;
	JButton alarmButton = null;

	public InternalAlarmUI() {
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Alarm");
		add(label);
		
		textStatus = new JTextField(5);
		textStatus.setText("OFF");
		textStatus.setEnabled(false);
		add(textStatus);
		
		alarmButton = new JButton("X");
		add(alarmButton);
	}

	public void setStatus(String Status) {
		textStatus.setText(Status);
		if (Status.equalsIgnoreCase("OFF")) {
			textStatus.setBackground(null);
		} else {
			textStatus.setBackground(Color.yellow);
			textStatus.setOpaque(true);
		}
	}
}