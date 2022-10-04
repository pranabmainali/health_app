package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    private static JLabel usernameLabel;
    private static JLabel passwordLabel;
    private static JTextField usernameTextField;
    private static JPasswordField passwordTextField;
    private static JButton loginButton;

    public LoginFrame() {

        //Frame
        this.setTitle("Health Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);

        //panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //adding username label
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(60, 150, 100, 40);
        panel.add(usernameLabel);

        //adding password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(60, 200, 100, 40);
        panel.add(passwordLabel);

        //adding usernameTextfield
        usernameTextField = new JTextField();
        usernameTextField.setBounds(150, 150, 200, 40);
        panel.add(usernameTextField);

        //adding passwordTextfield
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(150, 200, 200, 40);
        panel.add(passwordTextField);

        //adding login button
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 300, 50, 50);
        panel.add(loginButton);

        // setting of icon
        ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        this.setIconImage(health_fitness_icon.getImage());

        //adding everything to everything
        this.setVisible(true);

    }


}
