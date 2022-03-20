package cviko.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class CButton extends JButton{
    CButton(String napis){
        super(napis);
        Font font = new Font("Arial", Font.BOLD,20);
        setPreferredSize(new Dimension(60,30));
        setFont(font);
    }
}

class CalcFrame extends JFrame implements ActionListener, KeyListener{
    JTextField display;
    int result;
    int number;
    boolean showResult;
    String operation;
    String showed;

    CButton[] numbers = new CButton[10];
    CButton plus;
    CButton minus;
    CButton multiply;
    CButton reset;
    CButton equals;
    CButton sign;

    public CalcFrame(){
        super("Calc");
        result = 0;
        number = 0;
        showResult = false;
        operation = "+";
        showed = "";

        display = new JTextField(10);
        Font font = new Font("Arial", Font.BOLD,20);
        display.setSize(150,20);
        display.setFont(font);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        JPanel p = new JPanel();
        p.add(display);
        add(p);

        JPanel p1 = new JPanel();
        setLayout(new GridLayout(0,1));

        for (int i = 0;i<10;i++){
            numbers[i] = new CButton(Integer.toString(i));
            numbers[i].addActionListener(this);

            plus = new CButton("+");
            plus.addActionListener(this);

            minus = new CButton("-");
            minus.addActionListener(this);

            multiply = new CButton("*");
            multiply.addActionListener(this);

            equals = new CButton("=");
            equals.addActionListener(this);

            reset = new CButton("C");
            reset.addActionListener(this);

            sign = new CButton("/");
            sign.addActionListener(this);

            p1.add(numbers[0]);
            p1.add(sign);
            p1.add(reset);
            p1.add(equals);

            JPanel p2 = new JPanel();
            p2.add(numbers[1]);
            p2.add(numbers[2]);
            p2.add(numbers[3]);
            p2.add(plus);

            JPanel p3 = new JPanel();
            p2.add(numbers[4]);
            p2.add(numbers[5]);
            p2.add(numbers[6]);
            p2.add(minus);

            JPanel p4 = new JPanel();
            p2.add(numbers[7]);
            p2.add(numbers[8]);
            p2.add(numbers[9]);
            p2.add(multiply);

            add(p);
            add(p1);
            add(p2);
            add(p3);

            display.addKeyListener(this);
            setSize(300,300);
            setVisible(true);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                }
            });

        }

    }


    public void actionPerformed(ActionEvent e) {
        String bla = e.getActionCommand();
        akcia(bla);
    }

    public void keyTyped(KeyEvent e) {
        String bla = Character.toString(e.getKeyChar());
        akcia(bla);
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void akcia (String bla){}
}

public class Calc {
    new CalcFrame();
}
