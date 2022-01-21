package boardgame;

public class Piece {

	// Essa posi��o � da Matriz e n�o a posi��o dentro do tabuleiro
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	// Somente Classes e subclasses dentro do mesmo pacote tem acesso
	protected Board getBoard() {
		return board;
	}
	
	
}
