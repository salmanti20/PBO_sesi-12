
/*
 * Nama     : Salman Alfariji
 * NIM      : 20200040033
 * Kelas    : TI20A
 */

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    GridLayout gl = new GridLayout(4,6);
    JButton b1 = new JButton("");
    
    
    Layout(){
        super("Graphical User Interface");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        setLayout(gl);
        add(" West ",b1);
        add(new JButton(" 1 "));
        add(new JButton(" 2 "));
        add(new JButton(" 3 "));
        add(new JButton(" 4 "));
        add(new JButton(" 5 "));
        add(new JButton(" 6 "));
        add(new JButton(" 7 "));
        add(new JButton(" 8 "));
        add(new JButton(" 9 "));
        add(new JButton(" 0 "));
        add(new JButton(" + "));
        add(new JButton(" - "));
        add(new JButton(" * "));
        add(new JButton(" / "));
        add(new JButton(" = "));
        add(new JButton(" % "));
        add(new JButton(" Mod "));
        add(new JButton(" Exit "));
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Layout form= new Layout();
    }
    
}