import javax.swing.JPanel;

public class Car implements ICar {

	int currentFloorNumber = 1;

	IDoor door = null;

	String carName = "Car";

	IUserPanel userPanel = null;

	IDoorPanel doorPanel = null;

	CarUI carUI = null;

	ICarController carController = null;

	IUserPanelQueue queue = null;
	
	IAlarmSwitch alarmSwitch = null;

	CarStatus status = CarStatus.IDLE;

	CarRunnable carRunnable = null;

	Thread carThread = null;

	int carID;

	public Car() {
		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarType() {
		if (userPanel.getSelection() == 1)
			return "even";
		else if (userPanel.getSelection() == 2)
			return "odd";
		return "seq";
	}

	public ICarController getCarController() {
		return carController;
	}

	public void setCarController(ICarController carController) {
		this.carController = carController;
	}

	public JPanel createCar() {
		carUI = new CarUI(currentFloorNumber, carName, door, userPanel,
				doorPanel, alarmSwitch);
		return carUI;
	}

	public int getCurrentFloorNumber() {
		return currentFloorNumber;
	}

	public void setCurrentFloorNumber(int currentFloorNumber) {
		this.currentFloorNumber = currentFloorNumber;
		if (carUI != null) {
			carUI.setCurrentFloorNumber(currentFloorNumber);
			this.carController.getFloorPanel()
					.processStatusRequest(
							this.carRunnable.destinationFloorNumber,
							currentFloorNumber);
		}
	}

	public IDoor getDoor() {
		return door;
	}

	public void setDoor(IDoor door) {
		this.door = door;
	}
	
	public IAlarmSwitch getAlarmSwitch() {
		return alarmSwitch;
	}
	
	public void setAlarmSwitch(IAlarmSwitch alarmSwitch) {
		this.alarmSwitch = alarmSwitch;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public IUserPanel getUserPanel() {
		return userPanel;
	}

	public void setUserPanel(IUserPanel userPanel) {
		this.userPanel = userPanel;
	}

	public IUserPanelQueue getUserPanelQueue() {
		return queue;
	}

	public void setUserPanelQueue(IUserPanelQueue userPanelQueue) {
		this.queue = userPanelQueue;

	}

	public void moveDown(int destinationFloorNo) {
		setStatus(CarStatus.MOVING_DOWN);
		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
		carRunnable.setCar(this);
		carRunnable.setDestinationFloorNumber(destinationFloorNo);
		carRunnable.setDirection("DOWN");
		carThread.start();

	}

	public synchronized void moveUp(int destinationFloorNo) {

		setStatus(CarStatus.MOVING_UP);
		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
		carRunnable.setCar(this);
		carRunnable.setDestinationFloorNumber(destinationFloorNo);
		carRunnable.setDirection("UP");
		carThread.start();

	}

	public CarStatus getStatus() {
		return status;
	}

	public void setStatus(CarStatus status) {
		this.status = status;
		if (carUI != null)
			carUI.setCarStatus(status);

	}

	public IDoorPanel getDoorPanel() {
		return doorPanel;
	}

	public void setDoorPanel(IDoorPanel doorPanel) {
		this.doorPanel = doorPanel;

	}

}

class CarRunnable implements Runnable {

	ICar car = null;

	int destinationFloorNumber = 0;

	String direction = null;

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setCar(ICar car) {
		this.car = car;
	}

	public void setDestinationFloorNumber(int destinationFloorNumber) {
		this.destinationFloorNumber = destinationFloorNumber;
	}

	public CarRunnable() {

	}

	public CarRunnable(ICar car, int destinationFloorNumber) {

		this.car = car;

		this.destinationFloorNumber = destinationFloorNumber;
	}

	public void run() {

		car.getCarController()
				.getFloorPanel()
				.processIndicatorRequest(destinationFloorNumber,
						car.getCarID(), car.getCarType());
		if (direction.equalsIgnoreCase("UP")) {

			synchronized (car) {
				while (car.getCurrentFloorNumber() != destinationFloorNumber) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					car.setCurrentFloorNumber(car.getCurrentFloorNumber() + 1);

				}
				car.setStatus(CarStatus.STOPPED);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Reached destination "
						+ destinationFloorNumber);
				car.notifyAll();
			}
		} else {
			synchronized (car) {
				while (car.getCurrentFloorNumber() != destinationFloorNumber) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					car.setCurrentFloorNumber(car.getCurrentFloorNumber() - 1);
				}
				car.setStatus(CarStatus.STOPPED);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Reached destination "
						+ destinationFloorNumber);
				car.notifyAll();
			}
		}

	}

}
