package enumsYstreams;

public enum Sport {
	RUNNING(1), SOCCER(2), BASKET(2),TENNIS(3), JAVELIN(4);
	
	private int complexity;

	private Sport(int complexity) {
		this.complexity = complexity;
	}

	public int getComplexity() {
		return complexity;
	}

	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	
}
