package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece() {
		
	}

	public Piece(Board board) {
		position = null;
		this.board = board;
	}

	protected Board getBoard() { // somente subclasses ou classes do mesmo pacote podem acessar o tabuleiro de
		return board;							// uma peça
	}
}
