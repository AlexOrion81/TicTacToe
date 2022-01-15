import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Jaimee Bennett Student ID: 5048095 Project: Tick-Tac-Toe
 *         Date:18/12/21 Update:15/1/22 Version: 2
 *
 */

public class Board {
	// grid line width
	public static final int GRID_WIDTH = 8;
	// grid line half width
	public static final int GRID_WIDHT_HALF = GRID_WIDTH / 2;

	// 2D array of ROWS-by-COLS Cell instances
	Cell[][] cells;

	/** Constructor to create the game board */
	public Board() {
		
		
		cells[3][3] = null;
		
		for (int row = 0; row < GameMain.ROWS; ++row) {
			for (int col = 0; col < GameMain.COLS; ++col) {
				cells[row][col] = new Cell(row, col);
			}
		}
	}

	/** Return true if it is a draw (no more EMPTY cells) */ 
	public boolean isDraw() {
		Player players = null;
		// TODO: Check whether the game has ended in a draw. 
		// Hint: Use a nested loop (see the constructor for an example). Check whether any of the cells content in the board grid are Player.Empty. If they are, it is not a draw.
		// Hint: Return false if it is not a draw, return true if there are no empty positions left
		 if(hasWon() == false) { // TODO: fix 
		
		//no spaces left, and no winner = hasWon = false
		if (cells[0][0].content != players.Empty && cells[0][1].content != players.Empty && cells[0][2].content != players.Empty && cells[1][0].content != players.Empty && cells[1][1].content != players.Empty && cells[1][2].content != players.Empty && cells[1][2].content  != players.Empty && cells[2][0].content != players.Empty && cells[2][1].content != players.Empty && cells[2][2].content  != players.Empty) {
			return true; //draw
		//TODO fix ? content == Player.Nought
		}
		  }else
			  return false; //not a draw keep playing
	}

	/**
	 * Return true if the current player "thePlayer" has won after making their move
	 */
	public boolean hasWon(Player thePlayer, int playerRow, int playerCol) {
		// check if player has 3-in-that-row playerRow.
		if (cells[playerRow][0].content == thePlayer && cells[playerRow][1].content == thePlayer
				&& cells[playerRow][2].content == thePlayer)
			return true;

		// check if player has 3-in-that-column the playerCol.
		if (cells[0][playerCol].content == thePlayer && cells[1][playerCol].content == thePlayer
				&& cells[2][playerCol].content == thePlayer)

			return true;

		// 3-in-the-diagonal 1
		if (cells[0][0].content == thePlayer && cells[1][1].content == thePlayer && cells[2][2].content == thePlayer)
			return true;

		// 3-in-the-diagonal 2
		if (cells[2][0].content == thePlayer && cells[1][1].content == thePlayer && cells[0][2].content == thePlayer)
			return true;

		// no winner, keep playing

		return false;
	}

	/**
	 * Draws the grid (rows then columns) using constant sizes, then call on the
	 * Cells to paint themselves into the grid
	 */
	public void paint(Graphics g) {
		// draw the grid
		g.setColor(Color.gray);
		for (int row = 1; row < GameMain.ROWS; ++row) {
			g.fillRoundRect(0, GameMain.CELL_SIZE * row - GRID_WIDHT_HALF, GameMain.CANVAS_WIDTH - 1, GRID_WIDTH,
					GRID_WIDTH, GRID_WIDTH);
		}
		for (int col = 1; col < GameMain.COLS; ++col) {
			g.fillRoundRect(GameMain.CELL_SIZE * col - GRID_WIDHT_HALF, 0, GRID_WIDTH, GameMain.CANVAS_HEIGHT - 1,
					GRID_WIDTH, GRID_WIDTH);
		}

		// Draw the cells
		for (int row = 0; row < GameMain.ROWS; ++row) {
			for (int col = 0; col < GameMain.COLS; ++col) {
				cells[row][col].paint(g);
			}
		}
	}

}
