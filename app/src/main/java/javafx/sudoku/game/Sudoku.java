//impliment the wave function collapse algorithm to make a sudoku game in this file

package javafx.sudoku.game;

import java.util.Random; //this will be used later to pick a random number to collapse the cell with

public class Sudoku{

    boolean collapsed = false; //this assumes that no cells have a number in them yet

    public Sudoku(int[][] gameBoard) { //not sure what to put in here yet

    }

    //when collapsing a cell/chooseing a number for it, you also have to remove that number from every other cell in its row, column, and 3x3 square, impliment the function below
    public boolean refreshEntropy(int[][] gameBoard) {
        boolean finishedTask = false; //for this, you have to check the numberseach colmn, row, and designated 3x3 cube that its in, and elimiate those numbers from the possible values
        /*for () {

        } */
        return finishedTask;
    }

    //automatically chooses the cell with the least entropy and collapses it (chooses an available number for the cell)
    public int autoCollapseCell(int[] GameCell) {

        Random cellValue = new Random();
        int chosenValue = cellValue.nextInt(10);

        return chosenValue; //the int[] should contain the number of available options for the cell
    }

    public int collapseCell(int[] GameCell) { //this is for when the user manually solves the puzzle
        int chosenValue;

        return 0;
    }


    //displays the possible values for that cell
    public void showPossibleValues(int[] gameCell) {
        int[] availableValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //loop over every value in its row, collumn, and 3x3 square and elimate those values from the list of available values
        
    }

    // chooses the cell with the least entropy/options
    public void selectCell(int[] gameBoard, int[] gameCell) {
        
    }   

}