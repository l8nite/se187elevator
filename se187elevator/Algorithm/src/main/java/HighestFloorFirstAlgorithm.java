import java.util.List;

public class HighestFloorFirstAlgorithm implements IAlgorithm {

	@Override
	public ICar findBestCar(List<ICar> lstCars, Direction direction, int destinationFloorNumber) {
		ICar bestCar = lstCars.get(0);

        for (int i = 1; i < lstCars.size(); i++ ) {
            if (lstCars.get(i).getCurrentFloorNumber() > bestCar.getCurrentFloorNumber()) {
                bestCar = lstCars.get(i); 
            }
        }

		return bestCar;
	}

}
