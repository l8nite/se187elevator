import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestUserPanel implements IUserPanel {

	int selection;

	public JPanel createUserPanel() {
		JPanel j = new JPanel();
		j.add(new JLabel("This is test user panel"));
		return j;
	}

	public int getSelection() {
		return selection;
	}

	public void setSelection(int selection) {
		this.selection = selection;
	}

	public void deactivateFloorButton(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setActiveButtonColor(UserPanelColor arg0) {
		// TODO Auto-generated method stub

	}

	public void setButtonColor(UserPanelColor arg0) {
		// TODO Auto-generated method stub

	}

	public void setCar(ICar arg0) {
		// TODO Auto-generated method stub

	}

	public void setNumberFloors(int arg0) {
		// TODO Auto-generated method stub

	}

}
