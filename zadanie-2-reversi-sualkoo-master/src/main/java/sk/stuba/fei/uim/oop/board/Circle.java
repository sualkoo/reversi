package sk.stuba.fei.uim.oop.board;

import java.awt.*;

public class Circle {

    Color background;

    public void setBackground(final Color background) {
        this.background = background;
    }

    public void printCircle(final Graphics g, int i, int j, int height, int width, int boardSize)
    {
        g.setColor(this.background);
        g.fillOval(i * width / boardSize,j * height / boardSize,width / boardSize,height / boardSize);
    }
}
