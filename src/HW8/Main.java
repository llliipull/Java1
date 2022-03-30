package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int count = 0;


    public Main() {


        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,300,300);
        setResizable(false);

        JLabel counter = new JLabel("0");
        JButton leftButton = new JButton("<");
        JButton rightButton = new JButton(">");
        JButton dontTouch = new JButton("Не нажимать");




        Font font = new Font ("Arial", Font.ITALIC, 23);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                counter.setText(String.valueOf(count));
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                counter.setText(String.valueOf(count));
            }
        });

        dontTouch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.out.println("Просили же не нажимать!");
            }
        });


        add(counter, BorderLayout.CENTER);
        add(leftButton, BorderLayout.WEST);
        add(rightButton, BorderLayout.EAST);
        add(dontTouch, BorderLayout.SOUTH);

        setVisible(true);


    }

    public static void main (String[] args){
        new Main();


    }
}
