/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class karelmidterm extends SuperKarel {

	public void run () {
		moveUp();
		for (int i = 0; i < 4; i++) {
			handleBorder();
			nextSpot();
		}
	}
	
	private void handleBorder() {
		move();
		while (frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	
	private void moveUp() {
		turnLeft();
		move();
		turnRight();
	}
	
	private void nextSpot() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}

}
