public class MetaControllerFactory {

	public static IMetaController getMetaControllerInstance() {
		IMetaController metaController = null;

		if (MetaControllerConfiguration.getMetaControllerType()
				.equalsIgnoreCase("default")) {
			metaController = new MetaController();
		}

		metaController.setAlgorithm(AlgorithmConfiguration.getAlgorithm().createInstance());
	
		return metaController;
	}

}
