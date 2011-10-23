import java.util.Comparator;

public class UserPanelRequestDescComparator implements
		Comparator<UserPanelRequest> {

	public int compare(UserPanelRequest upr1, UserPanelRequest upr2) {

		if (upr1.getDestinationFloorNumber() < upr2.getDestinationFloorNumber()) {
			return 1;
		}

		if (upr1.getDestinationFloorNumber() > upr2.getDestinationFloorNumber()) {
			return -1;
		}

		return 0;
	}

}
