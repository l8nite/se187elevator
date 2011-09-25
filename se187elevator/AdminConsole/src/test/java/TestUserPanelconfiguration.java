
import junit.framework.TestCase;

import org.junit.Test;


import junit.framework.TestCase;

public class TestUserPanelconfiguration extends TestCase{
	
	public void testUserPanelTypeEven(){
		UserPanelConfiguration.setUserPanelType("Even");
       assertEquals(UserPanelConfiguration.getUserPanelType(),"Even");
}

public void testUserPanelTypeOdd(){
	UserPanelConfiguration.setUserPanelType("Odd");
	assertEquals(UserPanelConfiguration.getUserPanelType(),"Odd");
	}

public void testUserPanelTypeCurrent(){
	UserPanelConfiguration.setUserPanelType("Current");
	assertEquals(UserPanelConfiguration.getUserPanelType(),"Current");
	}

 public void testCarType(){
	String carType = "default";
	
	UserPanelConfiguration.setCarType(carType);
	assertEquals(UserPanelConfiguration.getCarType(), carType);
}
 public void testUserPanelQueue(){
		String queueType = "default";
		
		UserPanelConfiguration.setQueueType(queueType);
		assertEquals(UserPanelConfiguration.queueType, queueType);
	}

}	
	
	
	
	
	/*public void testCarType(){
		String carType = "default";
		
		UserPanelConfiguration.setCarType(carType);
		assertEquals(UserPanelConfiguration.getCarType(), carType);
	}
	
	public void testUserPanelQueue(){
		String queueType = "default";
		
		UserPanelConfiguration.setQueueType(queueType);
		assertEquals(UserPanelConfiguration.queueType, queueType);
	}*/
