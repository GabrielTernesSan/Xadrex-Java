package boardgame;

public abstract class Piece {

	// Essa posição é da Matriz e não a posição dentro do tabuleiro
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
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
