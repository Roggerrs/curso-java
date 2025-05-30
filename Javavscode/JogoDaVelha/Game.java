

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    public Game() {
        board = new Board();
        players = new Player[]{new Player('X'), new Player('O')};
        currentPlayerIndex = 0;
    }

    public void play() {
        // Lógica para alternar turnos e verificar vencedor
    }

    public boolean checkWinner() {
        // Implementar lógica para verificar se há um vencedor
        return false;
    }

    public void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }
}