import javax.swing.*;
import java.awt.*;

public class Main {

    public Main() { //constructor

        JFrame frame = new JFrame();
        
        JButton button = new JButton("Click Me");
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new Main();

    }
}
