package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseApp implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
