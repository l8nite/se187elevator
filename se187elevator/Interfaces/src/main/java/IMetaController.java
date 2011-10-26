public interface IMetaController extends IAlarmSwitchDelegate {

	public void processRequest(int destinationFloorNumber, Direction direction);

	public void registerCar(ICar car);

	public void setAlgorithm(IAlgorithm algorithm);

	public void registerAlarmDisplay(IAlarmDisplay alarmDisplay);
}
