package LLD_Sytem_Design.SnakeLadderGame;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    Game(){
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10, 5,3);
        dice = new Dice(2);
        winner = null;
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("Roshan", 0);
        Player player2 = new Player("Shubham", 0);

        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        while (winner == null){
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn : " + playerTurn.id + " current position is " + playerTurn.currentPosition);

            //roll the dice
            int diceNumber = dice.rollDice();

            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player turn : " + playerTurn.id + " new position is " + playerTurn.currentPosition);

            if(playerNewPosition >= board.cells.length * board.cells.length - 1){
                winner = playerTurn;
            }
        }

        System.out.println("Winner is : " + winner);
    }

    public int  jumpCheck(int position){
        //snake or ladder bite check
        int row = position / board.cells.length;
        int col = position % board.cells.length;

        Jump jump = board.getCell(position).jump;



        return jump != null ? jump.endPosition : position;
    }

    private Player findPlayerTurn(){
        Player playerTurn = players.poll();
        players.addLast(playerTurn);
        return playerTurn;
    }

}
