public class DoorFactory {

	public static IDoor createDoor() {
		IDoor door = null;

		if (DoorConfiguration.getDoorType().equalsIgnoreCase("SingleDoor")) {
			door = new SingleDoor();
		} else if (DoorConfiguration.getDoorType().equalsIgnoreCase(
				"DoubleDoor")) {
			door = new DoubleDoor();
		}

		/*
		 * if(DoorConfiguration.getCarType().equalsIgnoreCase("default")){ ICar
		 * car = new Car(); door.setCar(car); }
		 */

		/*
		 * if(DoorConfiguration.getCarControllerType().equalsIgnoreCase("default"
		 * )){ door.setCarController(new CarController()); }
		 */

		return door;

	}

}
