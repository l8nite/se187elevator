import java.awt.Color;

public enum AlarmColor {
	RED("Red", Color.RED),
	BLUE("Blue", Color.BLUE), 
	GREEN("Green", Color.GREEN), 
	YELLOW("Yellow", Color.YELLOW);

	private final String display;
	private final Color color;

	private AlarmColor(String s, Color c) {
		display = s;
		color = c;
	}

	@Override
	public String toString() {
		return display;
	}

	public Color getJColor() {
		return color;
	}
}