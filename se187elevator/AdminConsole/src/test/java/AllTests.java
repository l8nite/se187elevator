import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTest(UTest.suite());
		suite.addTest(FTest.suite());
		suite.addTest(AlgoTest.suite());
		suite.addTest(ElevatorSystemTest.suite());
		suite.addTest(AdminConoTest.suite());
		// $JUnit-END$
		return suite;
	}

}
