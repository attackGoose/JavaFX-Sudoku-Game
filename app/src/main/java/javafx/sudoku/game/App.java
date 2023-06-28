/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javafx.sudoku.game;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class App extends Application{

    //initializations
    Rectangle box_ur;
    Rectangle box_ul;
    Rectangle box_mm;
    Rectangle box_lr;
    Rectangle box_ll;
    Button testButton;
    Node node;
    TextField b11; //creates a text field to enter values: my reaction when i found it afte a week "YES FINALLY I CAN CONTINUE THIS PROJECT"
    TextField b21;
    StackPane testPane;

    //box slots/Grid: 
    TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10; 
    TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    TextField c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    TextField d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    TextField e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
    TextField f1, f2, f3, f4, f5, f6, f7, f8, f9, f10;
    TextField g1, g2, g3, g4, g5, g6, g7, g8, g9, g10;
    TextField h1, h2, h3, h4, h5, h6, h7, h8, h9, h10;
    TextField i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;

    int[][] GameBoard = new int[10][10]; //{ the starting value of each slot is 0, which wil need to be changed as the puzzle progresses



    Sudoku gamepannel = new Sudoku(GameBoard);
//https://edencoding.com/javafx-textfield/#:~:text=Validating%20user%20input%201%20TextFormatter%20class.%20If%20you,called%20a%20UnaryOperator.%203%20Testing%20for%20numbers.%20
//dats the tutorial, look over it later or tmr cus im lazy

    public Parent createApplication() {

        return new Pane(testButton);
        
    }

    //shows the game window and does stuff with the game window
    @Override
    public void start(Stage stage) throws Exception {

        //sets the background
        /* 
        TilePane tilePane = new TilePane();
        tilePane.setPrefColumns(3);
        tilePane.setPrefRows(3);
        tilePane.setTileAlignment( Pos.CENTER );

        tilePane.getChildren().addAll(
                new Rectangle( 300, 300, Color.GREY),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY )
        );*/

        testPane.getChildren().add(b11);
        //testpane.setFill(Color.LIGHTGRAY);


        //shows the packground
        stage.setTitle("Sudoku");
        Scene scene = new Scene(createApplication());
        stage.setScene( scene ); //try to figure out a way to work around this
        stage.show();
    }

    //runs the script
    public static void main(String[] args) {
        launch(args);
    }

}

/*
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
*/