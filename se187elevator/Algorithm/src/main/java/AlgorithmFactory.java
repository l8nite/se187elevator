public class AlgorithmFactory {

	public static IAlgorithm getAlgorithmInstance() {
		IAlgorithm algorithm = null;

		if (AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase(
				"Shortest Path")) {
			algorithm = new ShortestPathAlgorithm();
		} else if (AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase(
				"Random")) {
			algorithm = new RandomAlgorithm();
		} else if (AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase(
				"Highest Floor First")) {
			algorithm = new HighestFloorFirstAlgorithm();
		}

		return algorithm;
	}

}
