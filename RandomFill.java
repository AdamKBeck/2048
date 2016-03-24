import java.util.ArrayList;
import java.util.Random;

/**
 * This class has algorithms that randomly fill or reset the board when necessary.
 * @author Adam Beck
 */
public class RandomFill {

    /**
     * Randomly add a 2 in the board 
     * 
     * @param array The board
     */
	public static int[][] randomFill(int[][] array)
	{
		
		/* lists all possible x and y coordinates to place a random 2 */
		ArrayList<Integer> possibleXPositions = new ArrayList<Integer>();
		ArrayList<Integer> possibleYPositions = new ArrayList<Integer>();
		
		/* Fills the arrayLists of positions */
		for (int i = 0; i < array.length; i++){
		    for (int k = 0; k < array[i].length; k++){
		        if (array[i][k] == 0){
		            possibleXPositions.add(i);
		            possibleYPositions.add(k);
		        }
		    }
		}
		
		/* Reset board if board is full */
		if (possibleXPositions.size() == 0){
		    System.out.println("You lost. Board reset.");
		    return new int[4][4];
		}
		
		/* Place a random 2 on the board */
		Random rand = new Random();
		int xPos = possibleXPositions.get(rand.nextInt(possibleXPositions.size()));
	    int yPos = possibleYPositions.get(rand.nextInt(possibleYPositions.size()));
		
		array[xPos][yPos] = 2;
		return array;
	}
}
