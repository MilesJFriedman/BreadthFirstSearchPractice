package homework3BFS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * CalculatorGame.java
 * 
 * @author Miles Friedman m3488030 COP3503C P3
 * @version 6/20/14
 */
public class CalculatorGame {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("C:\\Users\\Miles\\workspace\\COP3503 - Computer Science II\\src\\homework3BFS\\input.txt"));
		
		int testCases = 0;
		int startingNum = -1;
		
		testCases = input.nextInt();
		//System.out.println(testCases);
		
		for (int i = 0; i < testCases; i++) { 
			//create a boolean array to keep track of found numbers 1-100 and initialize the 0th
			//element to true because it won't be used.
			boolean[] found = new boolean[101];
			found[0] = true;
			
			//get the starting number from the input file and create the starting QueueNode
			startingNum = input.nextInt();
			//System.out.println(startingNum);
			
			QueueNode node = new QueueNode(0, startingNum);
			
			//run the breadth first search
			BFS (found, node);
		}
		
	}

	public static boolean AllValuesFound (boolean [] found) {
		for (boolean value: found) {
			if(!value)
				return false;
		}
		
		return true;
	}
	
	public static void BFS (boolean[] found, QueueNode node) {
		//set up queue for breadth first search
		LinkedList<QueueNode> queue = new LinkedList<QueueNode>();
		
		//Mark the starting nodes value as found in the visited array and enqueue it
		found[node.getValue()] = true;
		queue.offer(node);
		
		//while there still remains a number 1-100 that hasn't been found
		while (AllValuesFound(found) != true) {
			
			//dequeue the next node
			QueueNode next = queue.poll();
			
			//create a new node representing the first button being pressed (add 1), also add 1 
			//to the distance of this node from the previous nodes distance.
			QueueNode press1st = new QueueNode(next.getDistance()+1, next.getValue()+1);
			//System.out.println("Debugging1: " + press1st.getValue());
			//create a new node representing the second button being pressed (multiply 3), also 
			//add 1 to the distance of this node from the previous nodes distance.
			QueueNode press2nd = new QueueNode(next.getDistance()+1, next.getValue()*3);
			//System.out.println("Debugging2: " + press2nd.getValue());
			//create a new node representing the third button being pressed (divide by 2), also
			//add 1 to the distance of this node from the previous nodes distance.
			QueueNode press3rd = new QueueNode(next.getDistance()+1, next.getValue()/2);
			//System.out.println("Debugging3: " + press3rd.getValue());
			
			//for each button pressed, so long as the integer value is within the 1 billion range
			//of the calculator, if the value is within the 100 values to be found, and has not
			//already been found, enqueue the new node and mark it as found. If the value is
			//greater than the 100 values to be found, merely enqueue the node.
			if (press1st.getValue() < 1000000000 && press1st.getValue() > 0) {
				if (press1st.getValue() <= 100 && found[press1st.getValue()] != true) {
					queue.offer(press1st);
					found[press1st.getValue()] = true;
					//if this node is the last that needs to be found, output the distance from the
					//start node required to get to this point (number of button presses needed)
					if (AllValuesFound(found) == true)
						System.out.println(press1st.getDistance());
				}
			} else
				queue.offer(press1st);
			
			if (press2nd.getValue() < 1000000000 && press2nd.getValue() > 0) {
				if (press2nd.getValue() <= 100 && found[press2nd.getValue()] != true) {
					queue.offer(press2nd);
					found[press2nd.getValue()] = true;
					//if this node is the last that needs to be found, output the distance from the
					//start node required to get to this point (number of button presses needed)
					if (AllValuesFound(found) == true)
						System.out.println(press2nd.getDistance());
				}	
			} else
				queue.offer(press2nd);
			
			if (press3rd.getValue() < 1000000000 && press3rd.getValue() > 0) {
				if (press3rd.getValue() <= 100 && found[press3rd.getValue()] != true) {
					queue.offer(press3rd);
					found[press3rd.getValue()] = true;
					//if this node is the last that needs to be found, output the distance from the
					//start node required to get to this point (number of button presses needed)
					if (AllValuesFound(found) == true)
						System.out.println(press3rd.getDistance());
				}
			} else
				queue.offer(press3rd);
			
		}//end while all values are not yet found
		
	}
	
}
