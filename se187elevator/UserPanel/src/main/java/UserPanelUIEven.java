public class UserPanelUIEven extends UserPanelUI {
	private static final long serialVersionUID = 3488903990975865351L;

	public UserPanelUIEven(int numFloors, UserPanelColor buttonColor,
			UserPanelColor activeButtonColor, ICar car) {
		super(numFloors, buttonColor, activeButtonColor, car, UserPanelType.EVEN);
	}
}