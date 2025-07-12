package calculator;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.lang.model.SourceVersion;


class close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28;
    String fv, sv, op;
    Double fdv, sdv, tot;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.lightGray);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(400, 600);
        f.setLocationRelativeTo(null);
        

        Font f1 = new Font("Poppins", Font.BOLD, 18);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 40);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        m1.add(mi);

        mb.add(m1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("View Help F1");
        MenuItem mi5 = new MenuItem("About Calculator");

        m2.add(mi2);
        m2.add(mi3);

        m3.add(mi4);
        m3.add(mi5);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        GridLayout gl = new GridLayout(7, 4, 15, 15);
        p2.setLayout(gl);
        p2.setBackground(Color.LIGHT_GRAY);

        tf = new TextField(15);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(black);
        tf.setBackground(white);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("M+");
        b4 = new Button("M-");
        b5 = new Button("MS");
        b6 = new Button("SQRT");
        b7 = new Button("CE");
        b8 = new Button("C");
        b9 = new Button("<--");
        b10 = new Button("1/X");
        b11 = new Button("%");
        b12 = new Button("/");
        b13 = new Button("7");
        b14 = new Button("8");
        b15 = new Button("9");
        b16 = new Button("*");
        b17 = new Button("4");
        b18 = new Button("5");
        b19 = new Button("6");
        b20 = new Button("-");
        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("+");
        b25 = new Button("+/-");
        b26 = new Button("0");
        b27 = new Button(".");
        b28 = new Button("=");

        b1.setBackground(Color.lightGray);
        b2.setBackground(Color.lightGray);
        b3.setBackground(Color.lightGray);
        b4.setBackground(Color.lightGray);
        b5.setBackground(Color.lightGray);
        b6.setBackground(Color.lightGray);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.lightGray);
        b10.setBackground(Color.lightGray);
        b11.setBackground(Color.lightGray);
        b12.setBackground(Color.lightGray);
        b13.setBackground(Color.lightGray);
        b14.setBackground(Color.lightGray);
        b15.setBackground(Color.lightGray);
        b16.setBackground(Color.lightGray);
        b17.setBackground(Color.lightGray);
        b18.setBackground(Color.lightGray);
        b19.setBackground(Color.lightGray);
        b20.setBackground(Color.lightGray);
        b21.setBackground(Color.lightGray);
        b22.setBackground(Color.lightGray);
        b23.setBackground(Color.lightGray);
        b24.setBackground(Color.lightGray);
        b25.setBackground(Color.lightGray);
        b26.setBackground(Color.lightGray);
        b27.setBackground(Color.lightGray);
        b28.setBackground(Color.white);

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b16.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f1);
        b20.setFont(f1);
        b21.setFont(f1);
        b22.setFont(f1);
        b23.setFont(f1);
        b24.setFont(f1);
        b25.setFont(f1);
        b26.setFont(f1);
        b27.setFont(f1);
        b28.setFont(f1);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }
        Object o = d.getSource();

        if (o.equals(b26)) {

            tf.setText(tf.getText() + b26.getLabel());

        } else if (o.equals(b21)) {

            tf.setText(tf.getText() + b21.getLabel());

        } else if (o.equals(b22)) {

            tf.setText(tf.getText() + b22.getLabel());

        } else if (o.equals(b23)) {

            tf.setText(tf.getText() + b23.getLabel());

        } else if (o.equals(b17)) {

            tf.setText(tf.getText() + b17.getLabel());

        } else if (o.equals(b18)) {

            tf.setText(tf.getText() + b18.getLabel());

        } else if (o.equals(b19)) {

            tf.setText(tf.getText() + b19.getLabel());

        } else if (o.equals(b13)) {

            tf.setText(tf.getText() + b13.getLabel());

        } else if (o.equals(b14)) {

            tf.setText(tf.getText() + b14.getLabel());

        } else if (o.equals(b15)) {

            tf.setText(tf.getText() + b15.getLabel());

        } else if (o.equals(b8)) {
            tf.setText("");
        }else if (o.equals(b7)) {
            tf.setText("");
        }else if (o.equals(b9)) {// Back
            String s = tf.getText();
            if(s.length() > 0){
                tf.setText(s.substring(0,s.length() - 1));
            }
            if(tf.getText() .equals("")){
                tf.setText("0");
            }
        } else if (o.equals(b24)) {//+

            fv = tf.getText();
            op = b24.getLabel();
            tf.setText("");

        } else if (o.equals(b20)) {//-

            fv = tf.getText();
            op = b20.getLabel();
            tf.setText("");

        } else if (o.equals(b16)) {//*

            fv = tf.getText();
            op = b16.getLabel();
            tf.setText("");

        } else if (o.equals(b12)) {///

            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");

        } else if (o.equals(b11)) {//%

            fv = tf.getText();
            op = "%";
            tf.setText("");

        } else if (o.equals(b10)) {// 1/x

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(1 / fdv + "");

        }  else if (o.equals(b25)) {// +/-

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(-fdv + "");

        } else if (o.equals(b6)) {// sqrt

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.sqrt(fdv) + "");

        }else if (o.equals(b28)) {
            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");

            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            }else if (op.equals("%")) {
                tot = fdv % sdv;
                tf.setText(tot + "");
            }

        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}

