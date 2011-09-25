import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;




public class AlgoTest extends TestCase{
	ShortestPathAlgorithm salgo;
	public AlgoTest(String arg0) {
		super(arg0);
	};

	protected void setUp() throws Exception {
		super.setUp();
		salgo= new ShortestPathAlgorithm();
		}
		protected void tearDown() throws Exception {
			super.tearDown();
			salgo=null;
		}
		
		
		public void testBestCar_Single(){
			ArrayList<ICar> arr =  new ArrayList<ICar>();
			ICar car1 = new Car();
			IUserPanel u1=new UserPanel();
			u1.setSelection(1);
			car1.setUserPanel(u1);
			arr.add(car1);
			
			
			salgo.findBestCar(arr, Direction.UP,4);
			assertSame("Same",car1,salgo.findBestCar(arr, Direction.UP,4));
			
						
		}
		/*public void testBestCarEven(){
			ArrayList<ICar> arr =  new ArrayList<ICar>();
			ICar car1 = new Car();
			IUserPanel u1=new UserPanel();
			ICar car2 = new Car();
			IUserPanel u2=new UserPanel();
			IUserPanelQueue q1 = new UserPanelQueue();
			IUserPanelQueue q2 = new UserPanelQueue();
						
			//car1.setCurrentFloorNumber(4);
			//car2.setCurrentFloorNumber(1);
			
			//q1.putMessage(3);
			//q2.putMessage(2);
			
			u1.setSelection(1);
			car1.setUserPanel(u1);
			car1.setUserPanelQueue(q1);
			arr.add(car1);			

			u2.setSelection(2);
			car2.setUserPanel(u2);
			car2.setUserPanelQueue(q2);
			arr.add(car2);
			
			salgo.findBestCar(arr, Direction.DOWN,4);
			//assertSame("Even Car to serve request",car1,salgo.findBestCar(arr, Direction.UP,4));
			
		}*/
		
		/*public void testBestCarOdd(){
			ArrayList<ICar> arr =  new ArrayList<ICar>();
			ICar car1 = new Car();
			IUserPanel u1=new UserPanel();
			ICar car2 = new Car();
			IUserPanel u2=new UserPanel();
			
			car1.setCurrentFloorNumber(4);
			car2.setCurrentFloorNumber(1);
			
			
			IUserPanelQueue q1 = new UserPanelQueue();
			IUserPanelQueue q2 = new UserPanelQueue();
			                                   			
			u1.setSelection(1);
			car1.setUserPanel(u1);
			car1.setUserPanelQueue(q1);
			arr.add(car1);
			
					
			u2.setSelection(2);
			car2.setUserPanel(u2);
			car2.setUserPanelQueue(q2);
			arr.add(car2);
			
			salgo.findBestCar(arr, Direction.UP,4);
			//assertSame("Odd car to serve request",car2,salgo.findBestCar(arr, Direction.UP,3));
		}*/
		public void testPartition(){
						
			ArrayList<ICar> lstCars=new ArrayList<ICar>();
			
			ICar car1 = new Car();
			ICar car2 = new Car();
			ICar car3 = new Car();
			
			IUserPanel u1 = new UserPanel();			
			IUserPanel u2=new UserPanel();
			IUserPanel u3 = new UserPanel();
			
			u1.setSelection(1);
			u2.setSelection(2);
			u3.setSelection(0);
			
			car1.setUserPanel(u1);
			car2.setUserPanel(u2);
			car3.setUserPanel(u3);
			lstCars.add(car1);
			lstCars.add(car2);
			lstCars.add(car3);
			
			List<ICar> lst = salgo.partitionCars(lstCars,2);
			
			//assertSame("Even Car List",car1,lst.get(0));
			
			//lst=salgo.partitionCars(lstCars,3);
			//assertSame("Odd Car List",car2,lst.get(1));
			
			
			
		}	
		
		
		public static TestSuite suite() {
			TestSuite suite= new TestSuite();
			//suite.addTest(new AlgoTest("testBestCarOdd"));
			//suite.addTest(new AlgoTest("testBestCarEven"));
			suite.addTest(new AlgoTest("testBestCar_Single"));
			suite.addTest(new AlgoTest("testPartition"));
			return suite;
	}

	
}