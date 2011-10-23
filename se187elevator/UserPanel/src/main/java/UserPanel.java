import javax.swing.JPanel;

public class UserPanel implements IUserPanel {

	private ICar car = null;

	private UserPanelColor buttonColor = null;

	private UserPanelColor activeButtonColor = null;

	private UserPanelUI userPanelUI = null;

	private UserPanelUIEven userPanelUIEven = null;

	private UserPanelUIOdd userPanelUIOdd = null;

	private int selection = 0;

	public int getSelection() {
		return selection;
	}

	public void setSelection(int selection) {
		this.selection = selection;
	}

	public ICar getCar() {
		return car;
	}

	public void setCar(ICar car) {
		this.car = car;
	}

	public void setNumberFloors(int numberFloors) {
		this.numberFloors = numberFloors;
	}

	private int numberFloors = 1;

	public int getNumberFloors() {
		return numberFloors;
	}

	public UserPanel() {

	}

	public JPanel createUserPanel() {
		if (selection == 0) {
			userPanelUI = new UserPanelUI(numberFloors, buttonColor,
					activeButtonColor, car);
			return userPanelUI;
		} else if (selection == 1) {
			userPanelUIEven = new UserPanelUIEven(numberFloors, buttonColor,
					activeButtonColor, car);
			return userPanelUIEven;
		} else
			userPanelUIOdd = new UserPanelUIOdd(numberFloors, buttonColor,
					activeButtonColor, car);

		return userPanelUIOdd;
	}

	public void setActiveButtonColor(UserPanelColor color) {
		this.activeButtonColor = color;

	}

	public void setButtonColor(UserPanelColor color) {
		this.buttonColor = color;

	}

	public void deactivateFloorButton(int floorNumber) {
		if (selection == 0)
			userPanelUI.deactivateFloorButton(floorNumber);
		else if (selection == 1)
			userPanelUIEven.deactivateFloorButton(floorNumber);
		else
			userPanelUIOdd.deactivateFloorButton(floorNumber);

	}

}
