import javax.swing.JPanel;

public class TestCar implements ICar {

	IUserPanelQueue usePanelQueue = null;

	public JPanel createCar() {
		// TODO Auto-generated method stub
		return null;
	}

	public ICarController getCarController() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCurrentFloorNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public IUserPanelQueue getUserPanelQueue() {
		// TODO Auto-generated method stub
		return usePanelQueue;
	}

	public void setCarController(ICarController arg0) {
		// TODO Auto-generated method stub

	}

	public void setCurrentFloorNumber(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setDoor(IDoor arg0) {
		// TODO Auto-generated method stub

	}

	public void setUserPanel(IUserPanel arg0) {
		// TODO Auto-generated method stub

	}

	public void setUserPanelQueue(IUserPanelQueue arg0) {
		this.usePanelQueue = arg0;

	}

	public IDoor getDoor() {
		// TODO Auto-generated method stub
		return null;
	}

	public CarStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public IUserPanel getUserPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void moveDown(int arg0) {
		// TODO Auto-generated method stub

	}

	public void moveUp(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setStatus(CarStatus arg0) {
		// TODO Auto-generated method stub

	}

	public IDoorPanel getDoorPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDoorPanel(IDoorPanel arg0) {
		// TODO Auto-generated method stub

	}

	public String getCarType() {
		return "Test";
	}

	public int getCarID() {
		return -1;
	}

	public void setCarID(int id) {
	}
}
