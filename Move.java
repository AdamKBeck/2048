/**
 * This class handles all algorithms for sliding the 
 * tiles across the game board.
 * 
 * @author Adam Beck
 */
public class Move {
	
	public static int[][] move(int[][] array, String input)
	{
		int[][] returnArray = array;
		
		if (input.equals("a")){
		    moveLeft(array);	
		}

		if (input.equals("d")){
		     moveRight(array);
		}

		if (input.equals("s")){
		     moveDown(array);
		}

		if (input.equals("w")){
		     moveUp(array);
		}

		return returnArray;
		
	}
	
	/**
	 * Moves the tiles left on the board
	 * @param returnArray The board
	 */
	public static void moveLeft(int[][] returnArray){
        for (int i = 0; i < 4; i++)  {
            for (int k = 1; k < 4; k++){ // Start at 1 because you don't want to slide the leftMost side.
                if (returnArray[i][k] != 0){
                    // If it doesn't == 0, start moving.
               
                    int num = returnArray[i][k];
                    
                    /* Collide similar numbers */
                    if (returnArray[i][k-1] == num){
                        returnArray[i][k-1] *=2;
                        returnArray[i][k] = 0;
                    }
                    
                    /* If there's a different number to the left, don't collide them */
                    else if (returnArray[i][k-1] != 0){
                        
                    }
                    
                    else{
                        returnArray[i][k-1] = num; // move it over 1 space to the left.
                        returnArray[i][k] = 0; // Original spot is now 0;
                    }
                }
            }
        }
	}
    
	/**
	 * Moves the board right.
	 * @param returnArray The board
	 */
	public static void moveRight(int[][] returnArray){
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                // End at 3 so you don't go over the right column.
            
                if (returnArray[i][k] != 0) {
                    // If it doesn't == 0, start moving.
                
                    int num = returnArray[i][k];
                    
                    if (returnArray[i][k+1] == num){
                        returnArray[i][k+1] *=2;
                        returnArray[i][k] = 0;
                    }
                    
                    else if (returnArray[i][k+1] != 0){
                       
                    }
                    
                    else{
                        returnArray[i][k+1] = num; // move it over 1 space to the right.
                        returnArray[i][k] = 0; // Original spot is now 0;
                    }
                }
            }
        }
	}
  
	/**
	 * Moves the board down
	 * @param returnArray The board
	 */
	public static void moveDown(int[][] returnArray){
        for (int i = 0; i < 3; i++){
            // End at 3 so you don't too far down.
       
            for (int k = 0; k < 4; k++) {
                if (returnArray[i][k] != 0){ 
                    // If it doesn't == 0, start moving.
                
                    int num = returnArray[i][k];
                    
                    if (returnArray[i+1][k] == num){
                        returnArray[i+1][k] *=2;
                        returnArray[i][k] = 0;
                    }
                    
                    else if (returnArray[i+1][k] != 0){

                    }
                    
                    else{
                        returnArray[i+1][k] = num; // move it over 1 space down.
                        returnArray[i][k] = 0; // Original spot is now 0;
                    }
                }
            }
        }
	}

	/**
	 * Moves the board up
	 * @param returnArray The board
	 */
	public static void moveUp(int[][] returnArray){
        for (int i = 1; i < 4; i++){
            // Start at one so you don't go too far up.
       
            for (int k = 0; k < 4; k++){ 
           
                if (returnArray[i][k] != 0){
                    int num = returnArray[i][k];
                    
                    if (returnArray[i-1][k] == num){
                        returnArray[i-1][k] *=2;
                        returnArray[i][k] = 0;
                    }
                    
                    else if (returnArray[i-1][k] != 0){
                      
                    }
                    
                    else{
                        returnArray[i-1][k] = num; // move it over 1 space up.
                        returnArray[i][k] = 0; // Original spot is now 0;
                    }
                }
            }
        }
	}
}
