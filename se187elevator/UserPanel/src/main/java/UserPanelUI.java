import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class UserPanelUI extends JPanel {

	private static final long serialVersionUID = -4160536353525076779L;
	private UserPanelColor buttonColor;
	private List<JButton> lstUserPanelButtons = new ArrayList<JButton>();
	public enum UserPanelType { ALL, ODD, EVEN };
	
	public UserPanelUI(int numFloors, UserPanelColor buttonColor,
			UserPanelColor activeButtonColor, ICar car) {

		this(numFloors, buttonColor, activeButtonColor, car, UserPanelType.ALL);
	}

	public UserPanelUI(int numFloors, UserPanelColor buttonColor,
			UserPanelColor activeButtonColor, ICar car, UserPanelType type) {

		this.initializeUI(numFloors, buttonColor, activeButtonColor, car, type);
	}

	public void initializeUI(int numFloors, UserPanelColor buttonColor,
			UserPanelColor activeButtonColor, ICar car, UserPanelType type) {

		setPreferredSize(new Dimension(200, 200));

		this.buttonColor = buttonColor;

		int gridLayoutRows = (int) Math.ceil((float) numFloors / 3.0);
		setLayout(new GridLayout(gridLayoutRows, 3));
		
		int buttonNum = type == UserPanelType.EVEN ? 2 : 1;
		int increment = type == UserPanelType.ALL ? 1 : 2;

		while (buttonNum <= numFloors) {
			JButton button = new JButton(Integer.toString(buttonNum));
			button.setBackground(buttonColor.getJColor());
			button.setOpaque(true);
			button.addActionListener(new UserPanelButtonListener(button
					.getText(), car, activeButtonColor));
			add(button);
			lstUserPanelButtons.add(button);
			buttonNum += increment;
		}
	}

	public void deactivateFloorButton(int floorNumber) {

		for (JButton button : lstUserPanelButtons) {
			if (Integer.parseInt(button.getText()) == floorNumber) {
				button.setBackground(buttonColor.getJColor());
				button.setOpaque(true);
				break;
			}
		}

	}

}
