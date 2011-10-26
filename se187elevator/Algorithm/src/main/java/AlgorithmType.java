public enum AlgorithmType {
		SHORTEST_PATH("Shortest Path"),
		RANDOM("Random"),
		HIGHEST_FLOOR_FIRST("Highest Floor First"),
		LEAST_TASKS("Least Tasks");

		private final String display;
		
		private AlgorithmType (String s) {
			display = s;
		}

		@Override
		public String toString() {
			return display;
		}
		
		public IAlgorithm createInstance() {
			switch (this) {
			case SHORTEST_PATH:
				return new ShortestPathAlgorithm();
			case RANDOM:
				return new RandomAlgorithm();
			case HIGHEST_FLOOR_FIRST:
				return new HighestFloorFirstAlgorithm();
			case LEAST_TASKS:
				return new LeastTasksAlgorithm();
			default:
				System.out.println("Unknown Algorithm" + this);
				return null;
			}
		}
	};