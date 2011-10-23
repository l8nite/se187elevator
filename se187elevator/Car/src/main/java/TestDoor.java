import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestDoor implements IDoor {

	public void closeDoor() {
		// TODO Auto-generated method stub

	}

	public JPanel createDoorUI() {
		JPanel j = new JPanel();
		j.add(new JLabel("This is test door"));
		return j;
	}

	public String getDoorStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void openDoor() {
		// TODO Auto-generated method stub

	}

	public void setCarController(ICarController arg0) {
		// TODO Auto-generated method stub

	}

	public void setDoorStatus(String arg0) {
		// TODO Auto-generated method stub

	}

}
