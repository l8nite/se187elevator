import java.util.ArrayList;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AdminConoTest extends TestCase {

	public AdminConoTest(String arg0) {
		super(arg0);
	};

	public void testButtonColor() {
		UserPanelColor testButtonColor = UserPanelColor.YELLOW;

		UserPanelConfiguration.setButtonColor(testButtonColor);
		System.out.println(UserPanelConfiguration.getButtonColor());

		ElevatorConfigurationReader.resolveUserPanelColor("YELLOW");
		assertEquals(
				ElevatorConfigurationReader.resolveUserPanelColor("YELLOW"),
				testButtonColor);
	}

	public void testActiveButtonColor() {
		UserPanelColor testActiveButtonColor = UserPanelColor.BLUE;
		// FloorPanelColor testOutputColor = FloorPanelColor.RED;

		UserPanelConfiguration.setButtonColor(testActiveButtonColor);
		assertEquals(UserPanelConfiguration.getButtonColor(),
				UserPanelColor.BLUE);
	}

	public void testNumberOfFloors() {
		int testFloorNumber = 3;

		GuiConfiguration.setNumOfFloors(testFloorNumber);
		assertEquals(GuiConfiguration.getNumOfFloors(), testFloorNumber);
	}

	public void testCarType() {
		String carType = "default";

		UserPanelConfiguration.setCarType(carType);
		assertEquals(UserPanelConfiguration.getCarType(), carType);
	}

	public void testUserPanelQueue() {
		String queueType = "default";

		UserPanelConfiguration.setQueueType(queueType);
		assertEquals(UserPanelConfiguration.queueType, queueType);
	}

	// Floor Panel

	public void testSetTextType_Floor() {
		String string = "up";
		String testString = "up";
		String testTextType;

		FloorPanelConfiguration.setTextType(string);
		testTextType = FloorPanelConfiguration.getTextType();
		assertEquals(testTextType, testString);
	}

	public void testDoorTextType() {
		GuiConfiguration.setDoorPanelDisplay("text");
		DoorPanelConfiguration.setTextType(GuiConfiguration
				.getDoorPanelDisplay());

		assertEquals(DoorPanelConfiguration.getTextType(), "text");

	}

	public void testAlgorithmType() {
		GuiConfiguration.setAlgorithmType("shortestPath");
		AlgorithmConfiguration
				.setAlgorithm(GuiConfiguration.getAlgorithmType());
		assertEquals(AlgorithmConfiguration.getAlgorithm(), "shortestPath");

		GuiConfiguration.setAlgorithmType("highestFloorFirst");
		AlgorithmConfiguration
				.setAlgorithm(GuiConfiguration.getAlgorithmType());
		assertEquals(AlgorithmConfiguration.getAlgorithm(), "highestFloorFirst");
	}

	public void testButtonColor_Floor() {
		FloorPanelColor testButtonColor = FloorPanelColor.YELLOW;

		FloorPanelConfiguration.setButtonColor(testButtonColor);
		System.out.println(FloorPanelConfiguration.getButtonColor());

		ElevatorConfigurationReader.resolveFloorPanelColor("YELLOW");
		// ElevatorConfigurationReader.showElevator();
		assertEquals(
				ElevatorConfigurationReader.resolveFloorPanelColor("YELLOW"),
				testButtonColor);
	}

	public void testActiveButtonColor_Floor() {
		FloorPanelColor testActiveButtonColor = FloorPanelColor.BLUE;

		FloorPanelConfiguration.setButtonColor(testActiveButtonColor);
		System.out.println(FloorPanelConfiguration.getButtonColor());
		assertEquals(FloorPanelConfiguration.getButtonColor(),
				FloorPanelColor.BLUE);
	}

	public void testSelectionList() {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(new Integer(1));
		lst.add(new Integer(2));

		GuiConfiguration.setSelectioArray(lst);
		assertSame("Same", GuiConfiguration.getSelectioArray(), lst);

	}

	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new AdminConoTest("testSetTextType_Floor"));
		suite.addTest(new AdminConoTest("testActiveButtonColor_Floor"));
		suite.addTest(new AdminConoTest("testButtonColor_Floor"));
		suite.addTest(new AdminConoTest("testNumberOfFloors"));
		suite.addTest(new AdminConoTest("testActiveButtonColor"));
		suite.addTest(new AdminConoTest("testButtonColor"));
		suite.addTest(new AdminConoTest("testCarType"));
		suite.addTest(new AdminConoTest("testUserPanelQueue"));
		suite.addTest(new AdminConoTest("testSelectionList"));
		suite.addTest(new AdminConoTest("testAlgorithmType"));
		suite.addTest(new AdminConoTest("testDoorTextType"));
		return suite;
	}

}
