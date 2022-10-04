package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        this.setTitle("Health Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);

        // setting of icon
        ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        this.setIconImage(health_fitness_icon.getImage());

    }
}
