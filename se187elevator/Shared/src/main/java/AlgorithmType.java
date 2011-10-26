public enum AlgorithmType {
		HIGHEST_FLOOR_FIRST("Highest Floor First"),
		SHORTEST_PATH("Shortest Path"),
		LEAST_TASKS("Least Tasks"),
		RANDOM("Random");

		private final String display;
		
		private AlgorithmType (String s) {
			display = s;
		}

		@Override
		public String toString() {
			return display;
		}
	};