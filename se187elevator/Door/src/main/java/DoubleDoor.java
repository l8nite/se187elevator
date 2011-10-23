import javax.swing.JFrame;
import javax.swing.JPanel;

public class DoubleDoor implements IDoor {

	// ICar car = null;

	ICarController carController = null;

	String doorStatus = "CLOSED";

	DoubleDoorUI doubleDoorUI = null;

	public void closeDoor() {
		DoorThread1 doorThread = new DoorThread1(this, "Close");
		Thread thread = new Thread(doorThread);
		thread.start();

	}

	public void openDoor() {

		DoorThread1 doorThread = new DoorThread1(this, "Open");
		Thread thread = new Thread(doorThread);
		thread.start();

	}

	/*
	 * public void setCar(ICar car) { this.car = car;
	 * 
	 * }
	 */

	public void setCarController(ICarController carController) {
		this.carController = carController;

	}

	public JPanel createDoorUI() {

		doubleDoorUI = new DoubleDoorUI();
		return doubleDoorUI;
	}

	public String getDoorStatus() {
		// TODO Auto-generated method stub
		return doorStatus;
	}

	public void setDoorStatus(String doorStatus) {
		this.doorStatus = doorStatus;
		doubleDoorUI.setDoorStatus(doorStatus);

	}

	public static void main(String[] args) {
		IDoor door = new SingleDoor();
		JFrame j = new JFrame();
		j.add(door.createDoorUI());
		j.setVisible(true);

		synchronized (door) {
			door.openDoor();
			try {
				door.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class DoorThread1 implements Runnable {

	IDoor door = null;

	String command = null;

	DoorThread1(IDoor door, String command) {
		this.door = door;
		this.command = command;
	}

	public void run() {

		int i = 0;
		if (command.equalsIgnoreCase("Open")) {
			synchronized (door) {
				while (i < 5) {
					door.setDoorStatus("OPENING");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i = i + 2;
				}

				door.setDoorStatus("OPENED");
				door.notifyAll();
			}
		} else {

			synchronized (door) {
				while (i < 5) {
					door.setDoorStatus("CLOSING");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i = i + 2;

				}

				door.setDoorStatus("CLOSED");
				door.notifyAll();
			}

		}

	}

}
