public class AlarmConfiguration {
	static AlarmColor alarmColor = AlarmColor.RED;

	public static AlarmColor getAlarmColor() {
		return alarmColor;
	}

	public static void setAlarmColor(AlarmColor alarmColor) {
		AlarmConfiguration.alarmColor = alarmColor;
	}
}
