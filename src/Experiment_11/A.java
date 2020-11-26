package Experiment_11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A extends Frame {
    A() {
        Label l = new Label("Email");
        TextField textField = new TextField();
        Label l2 = new Label("Password");
        TextField textField2 = new TextField();

        Button b = new Button("Submit");
        Button b2 = new Button("Cancel");
        b.setBounds(100, 200, 80, 30);// setting button position
        final Label[] tf = new Label[1];
        tf[0] = new Label();
        tf[0].setBounds(40, 20, 200, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tf[0].setText("Welcome!");
                add(tf[0]);
               // for (int i = 0; i <= 100000; i++) ;
               // remove(tf[0]);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf[0].setText("Cancelled!");

            }
        });
        b2.setBounds(100, 240, 80, 30);
        l.setBounds(100, 50, 80, 30);// setting button position
        textField.setBounds(100, 100, 100, 20);
        l2.setBounds(100, 120, 80, 30);
        textField2.setBounds(100, 150, 100, 20);
        add(b);//adding button into frame
        add(l);
        add(textField);
        add(l2);
        add(textField2);
        add(b2);
        setSize(300, 300);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
    }

    public static void main(String args[]) {
        A f = new A();
    }
}