import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class UTest extends TestCase{
	IUserPanel ui;
	UserPanelUI panelUi;
	public UTest(String arg0) {
		super(arg0);
	};
		
		@Before
		public void setUp() throws Exception
		{	
            UserPanelConfiguration.setUserPanelType("default");
			UserPanelConfiguration.setActiveButtonColor(UserPanelColor.BLUE);
			UserPanelConfiguration.setButtonColor(UserPanelColor.GREEN);
			UserPanelConfiguration.setSelection(1);
			UserPanelConfiguration.setNumberFloors(6);
			ui=UserPanelFactory.getUserPanelInstance();
			ui.setCar(new Car());		
		}

		@After
		public void tearDown() throws Exception {
			ui=null;
		}

		@Test
		public void testGetSelection() {
			assertEquals(1,ui.getSelection());
		}
		@Test
		public void testSetSelection() {
			ui.setSelection(2);
			assertEquals(2,ui.getSelection());
			
		}
		
		@Test
		public void testCreateUserPanelOdd() {							
			ui.setSelection(2);		
			String name=ui.createUserPanel().getClass().getName();
			System.out.println(name);
			assertEquals("UserPanelUIOdd",name);		
		}
		public void testCreateUserPanelEven() {
			ui.setNumberFloors(6);
			ui.setButtonColor(UserPanelColor.BLUE);
			ui.setActiveButtonColor(UserPanelColor.GREEN);
			ui.setCar(new Car());
							
			ui.setSelection(1);		
			String name=ui.createUserPanel().getClass().getName();
			System.out.println(name);
			assertEquals("UserPanelUIEven",name);		
		}
		public void testCreateUserPanelSeq() {
			
			ui.setSelection(0);		
			String name=ui.createUserPanel().getClass().getName();
			System.out.println(name);
			assertEquals("UserPanelUI",name);		
		}
		
			
		
		public static TestSuite suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new UTest("testCreateUserPanelOdd"));
			suite.addTest(new UTest("testCreateUserPanelEven"));
			suite.addTest(new UTest("testCreateUserPanelSeq"));
			suite.addTest(new UTest("testGetSelection"));
			return suite;
	}
	
	
}
