import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.getBoard().displayBoard();
            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("Jogador " + currentPlayer.getSymbol() + ", sua vez.");
            System.out.print("Linha (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Coluna (0-2): ");
            int col = scanner.nextInt();

            currentPlayer.makeMove(game.getBoard(), row, col);

            if (game.checkWinner()) {
                System.out.println("Jogador " + currentPlayer.getSymbol() + " venceu!");
                break;
            }

            game.switchPlayer();
        }
    }
}