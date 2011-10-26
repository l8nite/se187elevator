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
	};