package homework3BFS;

/**
 * QueueNode.java
 * 
 * @author Miles Friedman m3488030 COP3503C P3
 * @version 6/20/14
 */
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
