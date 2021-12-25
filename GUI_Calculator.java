
/*
 * Nama     : Salman Alfariji
 * NIM      : 20200040033
 * Kelas    : TI20A
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI_Calculator {

    public Component getGUI() {

        int p = 15;

        JPanel gui = new JPanel(new BorderLayout(p,p));
        gui.setBorder(new EmptyBorder(8, 8, 8, 8));

        JTextField tf = new JTextField(10);
        tf.setFont(tf.getFont().deriveFont(22f));
        gui.add(tf, BorderLayout.PAGE_START);

        JLabel l = new JLabel("");
        gui.add(l, BorderLayout.PAGE_END);

        JPanel lhs = new JPanel(new BorderLayout(p,p));
        gui.add(lhs, BorderLayout.CENTER);

        JPanel numpad = new JPanel(new GridLayout(3,3,p,p));
        lhs.add(numpad, BorderLayout.CENTER);
        for (int ii=1; ii<10; ii++) {
            numpad.add(new JButton("" + ii));
        }
        JPanel extraButtons = new JPanel(new GridLayout(0,1,p,p));
        lhs.add(extraButtons, BorderLayout.PAGE_END);
        extraButtons.add(new JButton("0"));
        extraButtons.add(new JButton("Mood"));

        JPanel rhs = new JPanel(new GridLayout(0,1,p,p));
        rhs.add(new JButton("+"));
        rhs.add(new JButton("-"));
        rhs.add(new JButton("/"));
        rhs.add(new JButton("x"));
        rhs.add(new JButton("="));
        gui.add(rhs, BorderLayout.LINE_END);

        return gui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                GUI_Calculator k = new GUI_Calculator();   

                JFrame f = new JFrame("Kalkulator");
                f.add(k.getGUI());

                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                f.setLocationByPlatform(true);

                
                f.pack();
                
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}