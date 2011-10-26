public class MetaControllerFactory {

	public static IMetaController getMetaControllerInstance() {
		IMetaController metaController = null;

		if (MetaControllerConfiguration.getMetaControllerType()
				.equalsIgnoreCase("default")) {
			metaController = new MetaController();
		}

		IAlgorithm algorithm = AlgorithmFactory
				.MakeAlgorithm(AlgorithmConfiguration.getAlgorithm());

		if (null == algorithm) {
			System.out.println("Unable to make Algorithm instance!");
		} else {
			metaController.setAlgorithm(algorithm);
		}

		return metaController;
	}

}
