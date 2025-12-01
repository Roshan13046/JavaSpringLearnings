package LLD_Sytem_Design.TicTacToeGame;

public class Player {
    String UserDetails;
    PlayingPiece playingPiece;

    Player(String name, PlayingPiece playingPiece){
        this.UserDetails = name;
        this.playingPiece = playingPiece;

    }
}
