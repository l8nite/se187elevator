public class MetaControllerConfiguration {

	private static String metaControllerType = "default";

	public static String getMetaControllerType() {
		return metaControllerType;
	}

	public static void setMetaControllerType(String metaControllerType) {
		MetaControllerConfiguration.metaControllerType = metaControllerType;
	}
}