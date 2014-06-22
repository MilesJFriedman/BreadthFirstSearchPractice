package homework3BFS;

public class QueueNode {
	
	private int distanceFromStart;
	private int value;
	
	public QueueNode (int d, int v) {
		this.distanceFromStart = d;
		this.value = v;
	}

	public int getDistance () {
		return this.distanceFromStart;
	}
	
	public int getValue () {
		return this.value;
	}
}
