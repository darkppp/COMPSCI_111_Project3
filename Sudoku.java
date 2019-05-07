// ===================================================================
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
// ===================================================================



// ===================================================================
class Sudoku {
// ===================================================================



    // ===============================================================
    public static void main (String[] args) {

	if (args.length != 1) {
	    System.err.println("USAGE: java Sudoku <initial board filename>");
	    System.exit(1);
	}

	String boardPath = args[0];

	// Initialize the board.  It is a 2-D board where each
	// position contains either its proper value or a 0 to
	// indicate a blank.
	int[][] board = new int[9][9];

	// Read the initial values into the board.
	readInitial(board, boardPath);
	Support.printAndVerifyInitialBoard(board, boardPath);

	// Solve, if possible...
	boolean isSolved = solve(board);

	// Print the outcome.
	Support.printResults(isSolved, board);

    } // main ()
    // ===============================================================



    // ===============================================================
    private static void readInitial (int[][] board, String pathname) {

	// WRITE THIS METHOD TO READ THE GIVEN FILE INTO THE BOARD.

    } // readInitial ()
    // ===============================================================



    // ===============================================================
    public static boolean solve (int[][] board) {

	// WRITE THIS METHOD TO SOLVE THE PUZZLE.  WRITE AS MANY
	// HELPER METHODS AS YOU NEED!
	
    } // solve ()
    // ===============================================================



// ===================================================================
} // class Sudoku
// ===================================================================
