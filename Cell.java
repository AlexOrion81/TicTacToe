	import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


	/**
	 * @author Jaimee Bennett
	 * Student ID: 5048095
	 * Project: Tick-Tac-Toe
	 * Date:18/12/21
	 * Update:15/1/22
	 * Version: 2
	 */
public class Cell {

	    //content of this cell (empty, cross, nought)
		Player content;
		//row and column of this cell
		int row, col;
		private Object player;
		
		/** Constructor to initialise this cell with the specified row and col */
		public Cell(int row, int col) {
			
			// TODO: Initialise the variables row, col 

			
			
		
			clear();
		}
		

		/** Paint itself on the graphics canvas, given the Graphics context g */ 
		public void paint(Graphics g) {
			//Graphics2D allows setting of pen's stroke size
			Graphics2D graphic2D = (Graphics2D) g;
			graphic2D.setStroke(new BasicStroke(GameMain.SYMBOL_STROKE_WIDTH, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			
			//draw the symbol in the position
			int x1 = col * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
			int y1 = row * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
			if (content == Player.Cross) {
				graphic2D.setColor(Color.RED);
				int x2 = (col + 1) * GameMain.CELL_SIZE - GameMain.CELL_PADDING;
				int y2 = (row + 1) * GameMain.CELL_SIZE - GameMain.CELL_PADDING;
				graphic2D.drawLine(x1, y1, x2, y2);
				graphic2D.drawLine(x2, y1, x1, y2);
			}else if (content == Player.Nought) {
				graphic2D.setColor(Color.BLUE);
				graphic2D.drawOval(x1, y1, GameMain.SYMBOL_SIZE, GameMain.SYMBOL_SIZE);
			}
		}
		
		/** Set this cell's content to EMPTY */
		public void clear() {
		//	Player player; //?
			// TODO: Set the value of content to Empty (Remember this is an enum)
			this.player.Empty //?
		
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 3; j++) {
//				board[i][j].setText(""); // sets to empty string
			
	
		}
			
	


}
