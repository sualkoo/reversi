package sk.stuba.fei.uim.oop.board;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GameBoard extends JPanel{

    private JPanel board;

    public final Square[][] c1squares = new Square[8][8];

    public GameBoard() {
        initializeGui();
    }

    public final void initializeGui() {

        for (int i = 0; i < c1squares.length; i++) {
            for (int j = 0; j < c1squares[i].length; j++) {

                Square square = new Square();
                c1squares[i][j] = square;
            }
        }

        Circle bCirc = new Circle();
        bCirc.setBackground(Color.BLACK);
        c1squares[c1squares.length/2-1][c1squares.length/2-1].setCircle(bCirc);
        c1squares[c1squares.length/2][c1squares.length/2].setCircle(bCirc);
        Circle wCirc = new Circle();
        wCirc.setBackground(Color.WHITE);
        c1squares[c1squares.length/2-1][c1squares.length/2].setCircle(wCirc);
        c1squares[c1squares.length/2][c1squares.length/2-1].setCircle(wCirc);

        board = new BoardPanel(c1squares);
        board.setBorder(new EmptyBorder(5, 5, 5, 5));
    }

    public final JComponent getGui() {
        return board;
    }

    public Square getSquare(int x, int y)
    {
        int height = board.getHeight();
        int width = board.getWidth();

        if (x >= width) {
            x = width - 1;
        }
        if (y >= height) {
            y = height - 1;
        }

        float squareHeight = (float)height/8;
        float squareWidth = (float)width/8;
        float j = y/squareHeight;
        float i = x/squareWidth;

        return c1squares[(int)i][(int)j];
    }
}
