
import java.awt.Color;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class FTest extends TestCase{

	private FloorPanelQueue fpQ;
	
	String args[] = { "Main.java", };
	String output;

	public FTest(String arg0) {
		super(arg0);
	};
	FloorPanelUI fpUI;
	//FloorPanel fi=
	//FloorPanelUI fp=new FloorPanelUI();
	//FloorPanelUI fp= new FloorPanelUI(fi,FloorPanelColor.BLUE,FloorPanelColor.RED,1,"uptext","downText");
	
	FloorPanel fp = new FloorPanel();
	protected void setUp() throws Exception {
	super.setUp();
	
	
	fpQ = new FloorPanelQueue();
	fpUI = new FloorPanelUI(fp, FloorPanelColor.YELLOW,	FloorPanelColor.RED, 1, "upText", "downText");	
	//fpQ = new FloorPanelQueue();
	//fp.lstFloorPanel.add(fp);
	//fp.createFloorPanel(2);
	
	}
	protected void tearDown() throws Exception {
		super.tearDown();
		fp = null;
		fpUI = null;
	}               
	
	public void testdisableUpButton(){
		fpUI.disableUpButton();
		if(fpUI.UpButton.isEnabled())
		{
			output = "true";
		}
		else
		{
			output = "false";
		}

		assertEquals("false",output);
	}
	
	public void testprocessedRequest(){
		fpUI.processedRequest();
		Color opcolor = fpUI.UpButton.getBackground();
		Color ipcolor = new Color(255,255,0);
		if(opcolor.getRGB() == ipcolor.getRGB())
		{
			output = "pass";
		}
		assertEquals("pass",output);
	}
	
	public void testbuttonStatus(){
		fpUI.floorPanel.setFloorPanelStatus("Active");
		assertEquals("Active",fpUI.floorPanel.getFloorPanelStatus());	
	}
	

	public void testprocessedIndicatorRequest(){
		//fp.processIndicatorRequest(1,2,"even");
		fpUI.processIndicatorRequest(2,"even");
		//System.out.println(fpUI.floorInd2.getText());
		assertEquals(Integer.toString(2),fpUI.floorInd2.getText());
		assertEquals("even",fpUI.floorInd4.getText());
	}

	public void testprocessedStatusRequest(){
		fpUI.processStatusRequest(3);
		assertEquals(Integer.toString(3),fpUI.floorInd5.getText());
	}
	public void testdisableDownButton(){
		fpUI.disableDownButton();
		if(fpUI.DownButton.isEnabled())
		{
			output = "true";
		}
		else
		{
			output = "false";
		}

		assertEquals("false",output);
	}
	
	
	//TC_3
	
	/*public void testdisableUpButton(){
		fpUI.disableUpButton();
		if(fpUI.UpButton.isEnabled())
		{
			output = "true";
		}
		else
		{
			output = "false";
		}

		assertEquals("false",output);
	}
	
	/*public void testprocessedRequest(){
		fpUI.processedRequest();
		Color opcolor = fpUI.UpButton.getBackground();
		Color ipcolor = new Color(255,255,0);
		if(opcolor.getRGB() == ipcolor.getRGB())
		{
			output = "pass";
		}
		assertEquals("pass",output);
	}
	
	public void testbuttonStatus(){
		fpUI.floorPanel.setFloorPanelStatus("Active");
		assertEquals("Active",fpUI.floorPanel.getFloorPanelStatus());	
	}
	*/
	public void testrequestEnqueue(){
		fpQ.putFloorRequest(1,Direction.UP);
		assertEquals("[currentFloornumber is 1 and direction is UP]",fpQ.queueFloorPanelRequest.toString());
	}
	
	
	
	
	public static TestSuite suite() {
	TestSuite suite= new TestSuite();
	suite.addTest(new FTest("testprocessedIndicatorRequest"));
	suite.addTest(new FTest("testprocessedStatusRequest"));
	suite.addTest(new FTest("testbuttonStatus"));
	suite.addTest(new FTest("testprocessedRequest"));
    suite.addTest(new FTest("testdisableDownButton"));
    suite.addTest(new FTest("testdisableUpButton"));
    suite.addTest(new FTest("testrequestEnqueue"));
	return suite;
	}

}
