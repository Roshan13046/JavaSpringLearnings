package LLD_Sytem_Design.SnakeLadderGame;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int noOfSnakes, int noOfladders){
        initializeCells(boardSize);
        addSnakesLadders(noOfSnakes, noOfladders);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];

        for(int i=0; i< boardSize; i++){
            for(int j=0; j < boardSize; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesLadders( int noOfSnakes, int noOfLadders){
        while (noOfSnakes > 0 ){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if(snakeHead <= snakeTail) continue;

            Jump snakeObj = new Jump();
            snakeObj.startPosition = snakeHead;
            snakeObj.endPosition = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            noOfSnakes--;
        }

        while (noOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length -1);

            if(ladderStart <= ladderEnd ) continue;

            Jump ladderObj = new Jump();
            ladderObj.startPosition = ladderStart;
            ladderObj.endPosition = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            noOfLadders--;
        }
    }

    public Cell getCell(int position){
        int row = position / cells.length;
        int col = position % cells.length;

        return cells[row][col];
    }
}
