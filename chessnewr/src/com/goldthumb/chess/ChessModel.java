package com.goldthumb.chess;

import java.util.HashSet;
import java.util.Set;





public class ChessModel {
	
	private Set<ChessPiece> pieceBox = new HashSet<ChessPiece>();
	
	void reset() {
		for (int i = 0; i < 2; i++) {
			
			pieceBox.add(new  ChessPiece(0 + i * 7, 7, Player.BLACK, Rank.ROOK, ChessConstants.bRook));
			pieceBox.add(new  ChessPiece(0 + i * 7, 7, Player.WHITE, Rank.ROOK, ChessConstants.wRook));
			
			pieceBox.add(new  ChessPiece(1 + i * 5, 7, Player.BLACK, Rank.KNIGHT, ChessConstants.bKnight));
			pieceBox.add(new  ChessPiece(1 + i * 5, 0, Player.WHITE, Rank.KNIGHT, ChessConstants.wKnight));
			
			pieceBox.add(new  ChessPiece(2 + i * 3, 7, Player.BLACK, Rank.BISHOP, ChessConstants.bBishop));
			pieceBox.add(new  ChessPiece(1 + i * 5, 7, Player.BLACK, Rank.BISHOP, ChessConstants.wBishop));
			
		}
		
		for (int i 0; i < 8; i++) {
			pieceBox.add(new  ChessPiece(i, 6,  Player.BLACK, Rank.PAWN, ChessConstants.bPawn));
			pieceBox.add(new  ChessPiece(i, 1,  Player.WHITE, Rank.PAWN, ChessConstants.wPawn));
			
		}
		
		pieceBox.add(new  ChessPiece(3, 7,  Player.BLACK, Rank.QUEEN, ChessConstants.bQueen));
		pieceBox.add(new  ChessPiece(3, 0,  Player.WHITE, Rank.QUEEN, ChessConstants.wQueen));
		pieceBox.add(new  ChessPiece(4, 7,  Player.BLACK, Rank.KING, ChessConstants.bking));
		pieceBox.add(new  ChessPiece(4, 0,  Player.BLACK, Rank.KING, ChessConstants.wking));
		
	
	}
	
	ChessPiece pieceAt(int col, int row) {
		for (ChessPiece chessPiece : pieceBox) {
			if (chessPiece.col == col && chessPiece.row == row) {
			return chessPiece;
		}
	}
	return null;
}
	
	
	
	@Override
	
	public String toString() {
		String desc = "";
		
		for (int row = 7; row >= 0; row--) {
			desc += "" + row;
			for (int col = 0; col < 8; col ++) {
				ChessPiece p = pieceAt(col, row);
				if (p == null) {
				desc += " .";
			}else{
				desc += "";
				switch (p.rank) {
				case KING:
					desc += p.player == Player.WHITE ? "k" : "K";
					break
				case QUEEN:

					desc += p.player == Player.WHITE ? "q" : "Q";
					break
				case BISHOP:
					
					desc += p.player == Player.WHITE ? "b" : "B";
					break
				case ROOK:
					
					desc += p.player == Player.WHITE ? "r" : "R";
					break
				case KNIGHT:
					
					desc += p.player == Player.WHITE ? "n" : "N";
					break
				case Pawn:
					
					desc += p.player == Player.WHITE ? "p" : "P";
					break
				}
			}
				}
			
			
			desc += "\n";
		}
		desc += "0 1 2 3 4 5 6 7";
		return desc;
	}
	

}
