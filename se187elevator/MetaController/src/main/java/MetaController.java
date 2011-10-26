import java.util.ArrayList;
import java.util.List;

public class MetaController implements IMetaController {

	private int alarmsActive = 0;
	private List<ICar> lstCars = new ArrayList<ICar>();
	private List<IAlarmDisplay> lstAlarmDisplays = new ArrayList<IAlarmDisplay>();

	private IAlgorithm algorithm = null;

	public void setAlgorithm(IAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void processRequest(int destinationFloorNumber, Direction direction) {

		ICar car = algorithm.findBestCar(lstCars, direction,
				destinationFloorNumber);

		car.getUserPanelQueue().putMessage(destinationFloorNumber);
	}

	public void registerCar(ICar car) {
		if (car != null) {
			lstCars.add(car);
		}
	}

	public void registerAlarmDisplay(IAlarmDisplay alarmDisplay) {
		if (null != alarmDisplay) {
			lstAlarmDisplays.add(alarmDisplay);
		}
	}

	public void alarmSwitchActivate(AlarmState alarmState) {
		if (AlarmState.ON == alarmState) {
			alarmsActive++;
		} else {
			alarmsActive--;
		}

		if (lstAlarmDisplays.size() <= 0) {
			return;
		}

		if (alarmsActive > 0) {
			alarmState = AlarmState.ON;
		} else {
			alarmState = AlarmState.OFF;
		}

		for (IAlarmDisplay display : lstAlarmDisplays) {
			display.setAlarmState(alarmState);
		}
	}
}