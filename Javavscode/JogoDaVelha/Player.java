package JogoDaVelha;

public class Player {


    
    
        private char symbol;
    
        public Player(char symbol) {
            this.symbol = symbol;
        }
    
        public char getSymbol() {
            return symbol;
        }
    
        public void makeMove(Board board, int row, int col) {
            if (!board.makeMove(row, col, symbol)) {
                System.out.println("Movimento inválido, tente novamente.");
            }
        
}
}
