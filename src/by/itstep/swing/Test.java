package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My app");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,800);

        frame.setLayout(null);

        JButton button = new JButton();
        button.setVisible(true);
        button.setText("Push me");
        button.setSize(100,40);

        frame.add(button);
        button.setLocation(230,280);

        JLabel lbl = new JLabel("Name: ");
        JTextField field = new JTextField();
        lbl.setBounds(230,242,120,20);
        field.setBounds(230,260,120,20);

        frame.add(lbl);
        frame.add(field);

        String name = field.getText();
        JLabel lbl1 = new JLabel("");
        lbl1.setBounds(380,259,120,20);
        frame.add(lbl1);






        frame.setVisible(true);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date() + ": click");
                String name = field.getText();
                System.out.println("hello " + name);
                lbl1.setText("Hello " + name);
            }
        });



    }
}
