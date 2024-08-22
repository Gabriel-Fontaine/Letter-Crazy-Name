import becker.robots.*;
public class Letter extends Robot{
	
	
	
	public Letter(City waterloo, int avenue, int street, Direction dir, int numThings) {
		super(waterloo, avenue, street, dir, numThings);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public void letterA(int letterStage){
		if (letterStage == 0){
			moves(3); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(2);
		} else if (letterStage == 1){
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterB (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterC (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(2); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterD (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterE (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterF (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterG (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(2); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterH (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterI (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 2) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterJ (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(3);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterK (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterL (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterM (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterN (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterO (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(2); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterP (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterQ (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(2); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();			
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterR (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(3);
			super.putThing();
			moves(1);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();			
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterS (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(2); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
		} else if (letterStage == 2) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(5);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterT (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 2) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 4) {
			moves(3);
			super.putThing();
			moves(2);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterU (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 4) {
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterV (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 3) {
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 4) {
			moves(3);
			super.putThing();
			moves(2);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterW (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 2) {
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
		} else if (letterStage == 3) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterX (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(4);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterY (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(4);
			super.putThing();
		} else if (letterStage == 1){
			moves(2);
			super.putThing();
			moves(2);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 4) {
			moves(3);
			super.putThing();
			moves(2);
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	public void letterZ (int letterStage) { // the stage of the letter represents the height of the row from top to bottom starting at zero
		if (letterStage == 0){
			moves(1); // as an idea all of the movements within an if statement should add up to 5 as a reminder that a letter has been fully completed
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		} else if (letterStage == 1){
			moves(4);
			super.putThing();
			moves(1);
		} else if (letterStage == 2) {
			moves(3);
			super.putThing();
			moves(2);
		} else if (letterStage == 3) {
			moves(2);
			super.putThing();
			moves(3);
		} else if (letterStage == 4) {
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
			moves(1);
			super.putThing();
		}
		moves(2); // by the end of each letter there should be a gap of 3 spaces
	}
	
	
	
	
	
	
	
	public void moves(int distance){
		for (int numTimesMoved = 0; numTimesMoved < distance; numTimesMoved += 1){
			this.move();
		}
	}
	
}
