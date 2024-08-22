import becker.robots.*;
/**
* RobotTask
* Task - add description
* U1A1
*/
public class RobotTask {
	/**
	 * description add
	 * @param none
	 * @return void
	 */
	String wordSize = "Gabriel"; // represents the word that you want the computer to type, as this will determine the length of how many times the loops will iterate through
	int travelDistance = 0; // the distance that the robot should travel
	char letterPos = (wordSize.toLowerCase()).charAt(0); // by default sets the initial letter position to the first character that is in the string
	
	public void run(){
		//build a city called waterloo
		City waterloo = new City(15,15);
		
		
		//build a robot in the city waterloo to print your name
		Letter robotOnRow1 = new Letter (waterloo, 1, 0, Direction.EAST, 100); // represents the robot which is on the first row
		Letter robotOnRow2 = new Letter (waterloo, 2, 0, Direction.EAST, 100);
		Letter robotOnRow3 = new Letter (waterloo, 3, 0, Direction.EAST, 100);
		Letter robotOnRow4 = new Letter (waterloo, 4, 0, Direction.EAST, 100);
		Letter robotOnRow5 = new Letter (waterloo, 5, 0, Direction.EAST, 100);
		Letter robotPosition = null; // object has to have a null default value since it is only assigned a value later
		
		travelDistance = wordSize.length(); // finds out how far the robot is required to travel, with each character representing 5 spaces horizontally
		
		for (int rowNum = 0; rowNum < (travelDistance - 1); rowNum += 1){
				if (rowNum == 0) { // this is used to simplify the code within this loop, so that the robot that is going to be assigned a letter is designated by which row is activated
					robotPosition = robotOnRow1;
				} else if (rowNum == 1) {
					robotPosition = robotOnRow2;
				} else if (rowNum == 2) {
					robotPosition = robotOnRow3;
				} else if (rowNum == 3) {
					robotPosition = robotOnRow4;
				} else if (rowNum == 4) {
					robotPosition = robotOnRow5;
				}
				
				robotPosition.letterG(rowNum);
				robotPosition.letterA(rowNum);
				robotPosition.letterB(rowNum);
				robotPosition.letterR(rowNum);
				robotPosition.letterI(rowNum);
				robotPosition.letterE(rowNum);
				robotPosition.letterL(rowNum);
				
				
				
		} // end of larger for loop
		
		
		
		System.out.println("finished");
	}
}
