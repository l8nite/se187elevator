import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class FloorPanel implements IFloorPanel {

	static List<FloorPanel> lstFloorPanel = new ArrayList<FloorPanel>();

	private int CurrentFloorNumber;
	private FloorPanelColor color = null;
	private FloorPanelColor activeButtonColor = null;
	private IFloorPanelQueue floorPanelQueue = null;
	private String FloorPanelStatus = "idle";
	private FloorPanelUI floorPanelUI = null;
	private IAlarmIndicator alarmIndicator = null;

	private String upText = null;
	private String downText = null;

	public FloorPanel() {
		lstFloorPanel.add(this);
	}

	public JPanel createFloorPanel(int CurrentFloorNumber) {
		this.CurrentFloorNumber = CurrentFloorNumber;
		System.out.println("creating new floor panel for floor "
				+ CurrentFloorNumber);
		floorPanelUI = new FloorPanelUI(this, color, activeButtonColor,
				CurrentFloorNumber, upText, downText, alarmIndicator);
		return floorPanelUI;
	}

	public void setFloorPanelQueueType(IFloorPanelQueue floorPanelQueue) {
		this.floorPanelQueue = floorPanelQueue;
	}

	public IFloorPanelQueue getFloorPanelQueueType() {
		return floorPanelQueue;
	}

	public String getUserRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCurrentFloor() {
		return CurrentFloorNumber;
	}

	public void setActiveButtonColor(FloorPanelColor floorPanelColor) {
		this.activeButtonColor = floorPanelColor;

	}

	public void setButtonColor(FloorPanelColor floorPanelColor) {
		this.color = floorPanelColor;

	}

	public String getFloorPanelStatus() {
		return FloorPanelStatus;
	}

	public void setFloorPanelStatus(String FloorPanelStatus) {
		this.FloorPanelStatus = FloorPanelStatus;
		System.out.println("Status set to " + FloorPanelStatus);
	}

	public void disableDownButton() {
		floorPanelUI.disableDownButton();

	}

	public void disableUpButton() {
		floorPanelUI.disableUpButton();

	}

	public void seDownText(String text) {
		this.downText = text;

	}

	public void setUpText(String text) {
		this.upText = text;

	}
	
	public IAlarmIndicator getAlarmIndicator() {
		return alarmIndicator;
	}

	public void setAlarmIndicator(IAlarmIndicator alarmIndicator) {
		this.alarmIndicator = alarmIndicator;
	}

	public void processedRequest(int floorNumber) {

		FloorPanel floorPanel = lstFloorPanel.get(lstFloorPanel.size()
				- floorNumber);
		floorPanel.floorPanelUI.processedRequest();

	}

	public void processIndicatorRequest(int floorNumber, int id, String type) {

		FloorPanel floorPanel = lstFloorPanel.get(lstFloorPanel.size()
				- floorNumber);
		floorPanel.floorPanelUI.processIndicatorRequest(id, type);

	}

	public void processStatusRequest(int floorNumber, int currentFloor) {

		FloorPanel floorPanel = lstFloorPanel.get(lstFloorPanel.size()
				- floorNumber);
		floorPanel.floorPanelUI.processStatusRequest(currentFloor);
	}

}
