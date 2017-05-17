
public class Delete extends Actor{

	public Delete() {

	}

	public void delete(Actor[][] board, int r, int c) {
		boolean valid = false;
		do {
			if(board[r][c] != null) {
				board[r][c] = null;
				valid = true;
			}  else {
				//Print out a message that says try again
			}
		} while (valid == false);
	}

}
