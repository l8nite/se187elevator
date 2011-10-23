public class AlgorithmConfiguration {
	private static AlgorithmType algorithm;

	public static AlgorithmType getAlgorithm() {
		return algorithm;
	}

	public static void setAlgorithm(AlgorithmType algorithm) {
		AlgorithmConfiguration.algorithm = algorithm;
	}
}