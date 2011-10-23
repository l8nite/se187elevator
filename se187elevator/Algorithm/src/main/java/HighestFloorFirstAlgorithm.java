import java.util.List;

public class HighestFloorFirstAlgorithm implements IAlgorithm {

	public ICar findBestCar(List<ICar> lstCars, Direction direction,
			int destinationFloorNumber) {
		System.out.println("Finding highest car to service request...");

		ICar bestCar = lstCars.get(0);

		for (int i = 1; i < lstCars.size(); i++) {
			if (lstCars.get(i).getCurrentFloorNumber() > bestCar
					.getCurrentFloorNumber()) {
				bestCar = lstCars.get(i);
			}
		}

		return bestCar;
	}

}
