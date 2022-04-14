package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.board.GameBoard;
import java.awt.*;
import javax.swing.*;

public class Game {

    public Player getCurrPlayer() {
        return currPlayer;
    }

    private Player currPlayer;
    private Player player1;
    private Player player2;

    public void toggleCurrPlayer() {
        if (this.currPlayer == this.player1) {
            this.currPlayer = this.player2;
        } else {
            this.currPlayer = this.player1;
        }
    }

    public Game() {
        SwingUtilities.invokeLater(() -> {
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        GameBoard gb = new GameBoard();
        JFrame frame = new JFrame("Othello/Reversi");
        MyAdapter mouse = new MyAdapter(gb, frame, this);
        this.player1 = new Player(Color.BLACK);
        this.player2 = new Player(Color.WHITE);
        this.currPlayer = this.player1;

        frame.add(gb.getGui());
        frame.setLocationByPlatform(true);
        frame.setMinimumSize(frame.getSize());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900,900));
        frame.setMinimumSize(new Dimension(900,900));
        frame.setLocation(50,50);
        frame.pack();
        frame.setVisible(true);
        frame.addMouseListener(mouse);
    }
}
