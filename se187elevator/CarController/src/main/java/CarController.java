import java.util.LinkedList;

public class CarController implements ICarController {

	ICar car = null;

	IDoor door = null;

	LinkedList<?> doorRequestQueue = new LinkedList<Object>();

	IFloorPanel floorPanel = null;

	public void processRequest(int destinationFloorNumber, Direction direction) {

		if (!car.getDoor().getDoorStatus().equalsIgnoreCase("CLOSED")) {
			processDoorRequest(DoorCommand.CLOSE);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (direction.equals(Direction.UP)) {
			synchronized (car) {
				car.moveUp(destinationFloorNumber);
				try {
					car.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		if (direction.equals(Direction.DOWN)) {
			synchronized (car) {
				car.moveDown(destinationFloorNumber);
				try {
					car.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		car.getUserPanel().deactivateFloorButton(destinationFloorNumber);

		floorPanel.processedRequest(destinationFloorNumber);

		processDoorRequest(DoorCommand.OPEN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		processDoorRequest(DoorCommand.CLOSE);
	}

	public void setCar(ICar car) {
		this.car = car;

	}

	public void processDoorRequest(DoorCommand doorCommand) {

		System.out.println("Inside Car Controller" + doorCommand);
		System.out.println("Inside Car Controller" + car.getStatus());
		door = car.getDoor();
		IDoorPanel doorPanel = car.getDoorPanel();
		if (doorCommand.equals(DoorCommand.OPEN)) {
			if ((car.getStatus().equals(CarStatus.STOPPED) || car.getStatus()
					.equals(CarStatus.IDLE))
					&& !car.getDoor().getDoorStatus()
							.equalsIgnoreCase("Opened")) {

				doorPanel.activateOpenButton();
				synchronized (door) {

					door.openDoor();
					try {

						door.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				doorPanel.deactivateOpenButton();

			}

		} else {
			if ((car.getStatus().equals(CarStatus.STOPPED) || car.getStatus()
					.equals(CarStatus.IDLE))
					&& !car.getDoor().getDoorStatus()
							.equalsIgnoreCase("Closed")) {

				doorPanel.activateCloseButton();
				synchronized (door) {
					door.closeDoor();
					try {

						door.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
			doorPanel.deactivateCloseButton();
		}

	}

	public void setFloorPanel(IFloorPanel floorPanel) {
		this.floorPanel = floorPanel;

	}

	public IFloorPanel getFloorPanel() {
		return floorPanel;

	}

}
