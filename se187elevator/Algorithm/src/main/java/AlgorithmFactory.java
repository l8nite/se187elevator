public class AlgorithmFactory {
	public static IAlgorithm MakeAlgorithm(AlgorithmType algorithmType) {
		switch (algorithmType) {
		case SHORTEST_PATH:
			return new ShortestPathAlgorithm();
		case RANDOM:
			return new RandomAlgorithm();
		case HIGHEST_FLOOR_FIRST:
			return new HighestFloorFirstAlgorithm();
		case LEAST_TASKS:
			return new LeastTasksAlgorithm();
		default:
			return null;
		}
	}
}