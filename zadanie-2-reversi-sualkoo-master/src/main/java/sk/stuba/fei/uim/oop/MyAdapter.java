package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.board.Circle;
import sk.stuba.fei.uim.oop.board.GameBoard;
import sk.stuba.fei.uim.oop.board.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyAdapter extends MouseAdapter
{
    private final JFrame frame;
    private Game game;
    GameBoard gb;

    public MyAdapter(GameBoard gb, JFrame frame, Game game) {
        this.gb = gb;
        this.frame = frame;
        this.game = game;
    }

    public void mousePressed(MouseEvent me) {

        int x = me.getX();
        int y = me.getY();

        Circle circ = new Circle();
        circ.setBackground(game.getCurrPlayer().getColor());
        gb.getSquare(x,y).setCircle(circ);
        frame.repaint();
        game.toggleCurrPlayer();

        // TODO possible moves
        for (int i = 0; i < gb.c1squares.length; i++) {
            for (int j = 0; j < gb.c1squares[i].length; j++) {

                if (i > 0) {
                    if (j > 0) {
                        // check stone of different color at this position
                        // in case of diff color => call stoneHandler(j - 1, i - 1, -1, -1)
                        System.out.println(gb.c1squares[i - 1][j - 1]); // upper left
                    }
                    System.out.println(gb.c1squares[i - 1][j]); // upper current column
                    if (j < gb.c1squares[i].length - 1) {
                        System.out.println(gb.c1squares[i - 1][j + 1]); // upper right
                    }
                }

                if (j > 0) {
                    System.out.println(gb.c1squares[i][j - 1]); // current row left
                }
                System.out.println(gb.c1squares[i][j]); // current row current column
                if (j < gb.c1squares[i].length - 1) {
                    System.out.println(gb.c1squares[i][j + 1]); // current row right
                }

                if (i < gb.c1squares.length - 1) {
                    if (j > 0) {
                        System.out.println(gb.c1squares[i + 1][j - 1]); // lower row left
                    }
                    System.out.println(gb.c1squares[i+1][j]); // lower row current column
                    if (j < gb.c1squares[i].length - 1) {
                        System.out.println(gb.c1squares[i + 1][j + 1]); // lower row right
                    }
                }
            }
        }

        Circle circ2 = new Circle();
        circ2.setBackground(Color.RED);
        gb.getSquare(x+200,y).setPossibleMove(circ2);
    }

    public boolean stoneHandler(int x, int y, int deltaX, int deltaY, Square[][] squares) {
        //Color currColor = squares[y][x].getStone().getColor();
        x += 2*deltaX;
        y += 2*deltaY;
        while (x >= 0 && x < squares.length && y >=0 && y < squares.length) {
            // if squares[y][x].getStone().getColor() == currColor {
            //    return true
            //}
        }
        return false;
    }
}

