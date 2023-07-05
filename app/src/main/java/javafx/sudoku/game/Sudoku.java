//impliment the wave function collapse algorithm to make a sudoku game in this file

package javafx.sudoku.game;

import java.util.Random; //this will be used later to pick a random number to collapse the cell with

public class Sudoku{

    //NOTE: the gameBoard parameter refers to the entire board, including dimensions in [rows][columns]

    //boolean collapsed = false; //this assumes that no cells have a number in them yet
    int[][] gameBoard;

    public Sudoku(int[][] gameBoard) { //not sure what to put in here yet

        this.gameBoard = gameBoard;

    }

    //when collapsing a cell/chooseing a number for it, you also have to remove that number from every other cell in its row, column, and 3x3 square, impliment the function below
    public boolean refreshEntropy(int[][] gameBoard) {
        boolean finishedTask = false; //for this, you have to check the numberseach colmn, row, and designated 3x3 cube that its in, and elimiate those numbers from the possible values
        /*for () {

        } */
        return finishedTask;
    }

    //automatically chooses the cell with the least entropy and collapses it (chooses an available number for the cell)
    public int autoCollapseCell(int[][] gameBoard, int GameCell) {

        int[] possibleValues = showPossibleValues(gameBoard, GameCell);

        Random cellValue = new Random();
        int chosenValue = cellValue.nextInt(10)-1;

        return possibleValues[chosenValue]; 
    }

    public int collapseCell(int[][] gameBoard, int chosenValue) { //this is for when the user manually solves the puzzle

        //checks if the value is in there
        int[] availableValues = showPossibleValues(gameBoard, chosenValue);

        for (int i = 0; availableValues.length < i; i++) {
            if (chosenValue == availableValues[i]) {
                return chosenValue;
            }
        }

        return 0; //0 means the value isn't available
    }


    //displays the possible values for that cell
    public int[] showPossibleValues(int[][] gameBoard, int cellValues) { //chosen game cell = passed in via a user input by button, refer to app.java for the value of a game cell
        int[] availableValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; //the gameboard value that u pass in should include the cell that you want to show the values for
        
        //searches the columns
        for (int i = 0; i < gameBoard[1].length; i++) {
            for (int item = 0; item < availableValues.length; item++) {
                if (gameBoard[item][cellValues/11] == availableValues[item]) { //if a value is 0, it means it is no longer available

                    availableValues[item] = 0;
                    /*
                    IntStream.range(0, availableValues.length)
                    .filter(x -> x != item)
                    .map(x -> availableValues[x])
                    .toArray();*/
                }
            }
        }

        for (int i = 0; i < gameBoard[0].length; i++) {
            for (int item = 0; item < availableValues.length; item++) {
                if (gameBoard[cellValues/11][item] == availableValues[item]) {
                    availableValues[item] = 0;
                }
            }
        }

        return availableValues;
        //loop over every value in its row, collumn, and 3x3 square and elimate those values from the list of available values
        
    }

    // chooses the cell with the least entropy/options after looking over every option in the row, column, and its 3x3 square, more than one cell is found
    public void selectCell(int[][] gameBoard) { 
        int minLength = 0; //set this value to the length of the cell with the lowest entropy
        for (int rowIndex = 0; gameBoard.length > rowIndex + 1; rowIndex++) {
            for (int columnIndex = 0; gameBoard.length > columnIndex + 1; columnIndex++) {
                int cellValues = gameBoard[rowIndex][columnIndex];
                if (cellValues/11 < minLength) {
                    minLength = cellValues;
                }
            }
        }
    }

}

//also you can place pictures of empty slots or numbered slots in the resources file then reference those from there, so the user can just play with only their mouse
//you can reference the pictures via .\resources\pngName.png i believe
