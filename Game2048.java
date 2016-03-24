import java.util.Random;
import java.util.Scanner;

/**
 * This project is the 2048 game played in the console
 * 
 * @author Adam Beck
 */
public class Game2048 {
	public static void main(String args[]){
		System.out.println("Press lowercase wasd to move the tiles.\n");
		
		boolean won = false; // If you win, won == true.
		String input = new String(); // String to store the input.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int[][] matrix = new int[4][4]; // 4x4 matrix.
		matrix[rand.nextInt(4)][rand.nextInt(4)] = 2; // A random spot is filled with a 2;
		
		print(matrix); // first print of the matrix.
		
		/* Play the game */
		while(won != true){
			System.out.print("Input:");
			input = scan.nextLine();
			System.out.println();
			
			matrix = Move.move(matrix, input);
			matrix = RandomFill.randomFill(matrix);
			print(matrix);
			won = check(matrix);
		}
		
		System.out.println("CONGRATULATIONS, YOU'VE WON!");
		
	}
	
	/**
	 * Prints the array game board with styling
	 * @param array The 2-D array to traverse and print
	 */
	public static void print(int[][] array){
		
		for (int i = 0; i < 4; i++){   
			System.out.println("+-------+-------+-------+-------+");
			
			for (int k = 0; k < 4; k++){
				System.out.print("|" + array[i][k] + "\t");
			}
			
			System.out.println("|");
			System.out.println();
		}
		
		System.out.print("+-------+-------+-------+-------+");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * Checks the array game board if there is a 2048 tile.
	 * 
	 * @param array The array to search and check.
	 * @return Whether the game is over or not.
	 */
	public static boolean check(int[][] array){
		for (int i = 0; i < 4; i++){
			for (int k = 0; k < 4; k++){
				if (array[i][k] >= 2048){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
