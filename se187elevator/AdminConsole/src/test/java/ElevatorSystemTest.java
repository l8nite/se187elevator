import java.util.LinkedList;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ElevatorSystemTest extends TestCase {

	public ElevatorSystemTest(String arg0) {
		super(arg0);
	};

	public void testCarStatusIdle() {
		FloorPanelQueue queue = new FloorPanelQueue();

		testList list = new testList();

		for (int i = 1; i <= 10; i++) {
			queue.putFloorRequest(i, Direction.UP);

		}
		list.testQueueList(queue);
	}

	public class testList extends FloorPanelQueue {

		public void testQueueList(FloorPanelQueue queue) {
			LinkedList<FloorPanelRequest> queueFloorPanelReques = new LinkedList<FloorPanelRequest>();
			LinkedList<FloorPanelRequest> queueFloorPanelRequest = queue
					.getQueueFloorPanelRequest();

			Car car = new Car();
			for (int i = 1; i <= 10; i++) {
				queueFloorPanelReques.offer(new FloorPanelRequest(i,
						Direction.UP));
			}

			while (queueFloorPanelRequest.size() != 0) {
				System.out.println("List1..."
						+ queueFloorPanelReques.pollFirst().toString());
				System.out.println("List..."
						+ queue.queueFloorPanelRequest.pollFirst().toString());

				System.out.println("-----" + car.getStatus().toString());
				assertEquals(car.getStatus(), CarStatus.IDLE);
			}
		}
	}

	// /Floor Panel Deactivation
	public void testFloorPanelButtonDeactivation() {
		FloorPanelQueue queue = new FloorPanelQueue();
		FloorPanel panel = new FloorPanel();

		LinkedList<FloorPanelRequest> queueFloorPanelReques = new LinkedList<FloorPanelRequest>();
		LinkedList<FloorPanelRequest> queueFloorPanelRequest = queue
				.getQueueFloorPanelRequest();

		if (queueFloorPanelRequest.size() == 0) {
			System.out.println("Queue is empty");
			for (int i = 1; i <= 10; i++) {
				queue.putFloorRequest(i, Direction.UP);
				queueFloorPanelReques.offer(new FloorPanelRequest(i,
						Direction.UP));
			}

			while (queueFloorPanelRequest.size() != 0) {
				System.out.println("List1..."
						+ queueFloorPanelReques.pollFirst().toString());
				System.out.println("List..."
						+ queue.queueFloorPanelRequest.pollFirst().toString());

				System.out.println("Status:" + panel.getFloorPanelStatus());
				assertEquals(panel.getFloorPanelStatus(), "idle");
			}
		} else {
			System.out.println("Failed");
		}
	}

	// Floor Panel DEque

	public void testDequeue() {

		FloorPanelQueue queue = new FloorPanelQueue();
		testList list = new testList();

		for (int i = 1; i <= 10; i++) {
			queue.putFloorRequest(i, Direction.UP);
		}
		list.testQueueList(queue);
	}

	/*
	 * public class testList extends FloorPanelQueue{
	 * 
	 * public void testQueueList(FloorPanelQueue queue){
	 * LinkedList<FloorPanelRequest> queueFloorPanelReques = new
	 * LinkedList<FloorPanelRequest>(); LinkedList<FloorPanelRequest>
	 * queueFloorPanelRequest = queue.getQueueFloorPanelRequest();
	 * 
	 * for(int i=1;i<=10;i++) queueFloorPanelReques.offer(new
	 * FloorPanelRequest(i, Direction.UP));
	 * 
	 * while(queueFloorPanelRequest.size()!=0){
	 * System.out.println("List1..."+queueFloorPanelReques
	 * .pollFirst().toString());
	 * System.out.println("List..."+queue.queueFloorPanelRequest
	 * .pollFirst().toString());
	 * 
	 * assertEquals(queue.queueFloorPanelRequest.toString(),queueFloorPanelReques
	 * .toString()); } } }
	 */

	// Floor panel
	public void testFloorEnqueue() {
		FloorPanelQueue queue = new FloorPanelQueue();
		testList list = new testList();

		for (int i = 1; i <= 10; i++) {
			queue.putFloorRequest(i, Direction.UP);
		}
		list.testQueueList(queue);
	}

	/*
	 * public class testList_Floor extends FloorPanelQueue{
	 * 
	 * public void testQueueList(FloorPanelQueue queue){
	 * LinkedList<FloorPanelRequest> queueFloorPanelReques = new
	 * LinkedList<FloorPanelRequest>();
	 * 
	 * for(int i=1;i<=10;i++) queueFloorPanelReques.offer(new
	 * FloorPanelRequest(i, Direction.UP));
	 * 
	 * System.out.println("List1..."+queueFloorPanelReques.toString());
	 * System.out.println("List..."+queue.queueFloorPanelRequest.toString());
	 * assertEquals
	 * (queue.queueFloorPanelRequest.toString(),queueFloorPanelReques
	 * .toString()); }
	 * 
	 * }
	 */

	// User Panel Enqueue
	public void testUserPanelFloorEnqueue() {
		UserPanelQueue queue = new UserPanelQueue();
		ICar car = new Car();
		queue.setCar(car);
		car.setUserPanelQueue(queue);

		System.out.println("Valid Enqueueing Case:");
		for (int i = 1; i <= 10; i++) {
			car.getUserPanelQueue().putMessage(i);
		}

		System.out.println("Up Queue Contains: "
				+ queue.queueUserPanelRequestUp);
		System.out.println("Down Queue Contains: "
				+ queue.queueUserPanelRequestDown);

		assertTrue(queue.queueUserPanelRequestDown.isEmpty());
	}

	public void testUserPanelFloorEnqueueInValid() {
		UserPanelQueue queue = new UserPanelQueue();
		ICar car = new Car();

		// queue.setCar(car);
		car.setUserPanelQueue(queue);
		System.out.println("Invalid Enqueueing Case:");
		car.setCurrentFloorNumber(3);
		/*
		 * for(int i=0;i<=10;i++){ car.getUserPanelQueue().putMessage(i); }
		 */

		System.out.println("Up Queue Contains : "
				+ queue.queueUserPanelRequestUp);
		System.out.println("Down Queue Contains: "
				+ queue.queueUserPanelRequestDown);

		assertTrue(queue.queueUserPanelRequestDown.isEmpty());
	}

	public void testQueueEmpty() {
		UserPanelQueue queue = new UserPanelQueue();
		LinkedList<UserPanelRequest> queueUserPanelRequestUp = queue
				.getQueueUserPanelRequestUp();

		Car car = new Car();
		if (queueUserPanelRequestUp.size() == 0) {
			System.out.println("Queue Size is zero");
			/*
			 * for(int i=1;i<=10;i++){ queue.putFloorRequest(i, Direction.UP );
			 * }
			 */
			assertEquals(car.getStatus(), CarStatus.IDLE);
		} else {
			System.out.println("Failed");
		}
	}

	public void testQueueEmptyEnqueueing() {
		UserPanelQueue queue = new UserPanelQueue();
		ICar car = new Car();

		queue.setCar(car);
		car.setUserPanelQueue(queue);

		if (queue.queueUserPanelRequestUp.size() == 0
				&& queue.queueUserPanelRequestDown.size() == 0)
			for (int i = 1; i <= 10; i++) {
				car.getUserPanelQueue().putMessage(i);
			}

		System.out.println("Queue Size Up: "
				+ queue.queueUserPanelRequestUp.size());
		System.out.println("Queue Size Down: "
				+ queue.queueUserPanelRequestDown.size());

		assertEquals(queue.queueUserPanelRequestUp.size(), 10);
		assertEquals(queue.queueUserPanelRequestDown.size(), 0);
	}

	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new ElevatorSystemTest("testQueueEmpty"));
		suite.addTest(new ElevatorSystemTest("testFloorPanelButtonDeactivation"));
		suite.addTest(new ElevatorSystemTest("testUserPanelFloorEnqueueInValid"));
		suite.addTest(new ElevatorSystemTest("testCarStatusIdle"));
		suite.addTest(new ElevatorSystemTest("testFloorEnqueue"));
		suite.addTest(new ElevatorSystemTest("testDequeue"));
		suite.addTest(new ElevatorSystemTest("testQueueEmptyEnqueueing"));
		return suite;
	}

}
