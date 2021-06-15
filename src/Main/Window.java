package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window(){
        setVisible(true);
        setSize(800,500);
        setLocation(900, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("Выход");
        ActionListener pushClose = new CloseApp();

        firstButton.addActionListener(pushClose);

        JButton secondButton = new JButton("Продолжить");

        ActionListener secondListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        secondButton.addActionListener(secondListener);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(firstButton);
        panel.add(secondButton);

        add(panel, BorderLayout.SOUTH);

    }

}
