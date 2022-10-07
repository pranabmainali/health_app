package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ControlInterface.ActivityLevelEnum;
import ControlInterface.GenderEnum;
import ControlInterface.StageEnum;

public class SignUpFrame extends JFrame implements ActionListener {
    MainGUIInterface guiInterface;
    JPanel panel;
    private static JLabel usernameLabel;
    private static JTextField usernameTextField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordTextField;
    private static JLabel confirmPasswordLabel;
    private static JPasswordField confirmPasswordTextField;
    private static JLabel firstNameLabel;
    private static JTextField firstNameTextField;
    private static JLabel lastNameLabel;
    private static JTextField lastNameTextField;
    private static JLabel ageLabel;
    private static JTextField ageTextField;
    private static JLabel heightLabel;
    private static JTextField heightTextField;
    private static JComboBox genderOption;
    private static JLabel genderOptionLabel;
    private static JComboBox activityLevelOption;
    private static JLabel activityLeveLabel;
    private static JButton signUpButton;

    public SignUpFrame(MainGUIInterface guiInterface) {
        this.guiInterface = guiInterface;

        // Frame
        this.setTitle("Health Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 800);

        // panel
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // adding firstname textfield
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(100, 100, 270, 50);
        panel.add(firstNameTextField);

        // adding firstname label
        firstNameLabel = new JLabel("First name");
        firstNameLabel.setBounds(100, 70, 100, 40);
        firstNameLabel.setFont(new Font(firstNameLabel.getName(), Font.PLAIN, 20));
        panel.add(firstNameLabel);

        // adding lastname textfield
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(400, 100, 275, 50);
        panel.add(lastNameTextField);

        // adding lastname label
        lastNameLabel = new JLabel("Last name");
        lastNameLabel.setBounds(400, 70, 100, 40);
        lastNameLabel.setFont(new Font(lastNameLabel.getName(), Font.PLAIN, 20));
        panel.add(lastNameLabel);

        // adding username textfield
        usernameTextField = new JTextField();
        usernameTextField.setBounds(100, 200, 575, 50);
        panel.add(usernameTextField);

        // adding username label
        usernameLabel = new JLabel("Email");
        usernameLabel.setBounds(100, 170, 100, 40);
        usernameLabel.setFont(new Font(usernameLabel.getName(), Font.PLAIN, 20));
        panel.add(usernameLabel);

        // adding password textfield
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(100, 300, 275, 50);
        panel.add(passwordTextField);

        // adding password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 270, 100, 40);
        passwordLabel.setFont(new Font(passwordLabel.getName(), Font.PLAIN, 20));
        panel.add(passwordLabel);

        // adding confirm password textfield
        confirmPasswordTextField = new JPasswordField();
        confirmPasswordTextField.setBounds(400, 300, 270, 50);
        panel.add(confirmPasswordTextField);

        // adding confirm password label
        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setBounds(400, 270, 200, 40);
        confirmPasswordLabel.setFont(new Font(confirmPasswordLabel.getName(), Font.PLAIN, 20));
        panel.add(confirmPasswordLabel);

        // adding age textfield
        ageTextField = new JTextField();
        ageTextField.setBounds(100, 400, 275, 50);
        panel.add(ageTextField);

        // adding age label
        ageLabel = new JLabel("age");
        ageLabel.setBounds(100, 365, 100, 40);
        ageLabel.setFont(new Font(ageLabel.getName(), Font.PLAIN, 20));
        panel.add(ageLabel);

        // adding height textfield
        heightTextField = new JTextField();
        heightTextField.setBounds(400, 400, 275, 50);
        panel.add(heightTextField);

        // adding height label
        heightLabel = new JLabel("Height");
        heightLabel.setBounds(400, 365, 100, 40);
        heightLabel.setFont(new Font(heightLabel.getName(), Font.PLAIN, 20));
        panel.add(heightLabel);

        // adding gender options
        String listofGenders[] = { GenderEnum.MALE.label, GenderEnum.FEMALE.label };
        genderOption = new JComboBox<>(listofGenders);
        genderOption.setBounds(100, 500, 275, 50);
        panel.add(genderOption);

        // adding gender label
        genderOptionLabel = new JLabel("Gender");
        genderOptionLabel.setBounds(100, 470, 100, 40);
        genderOptionLabel.setFont(new Font(genderOptionLabel.getName(), Font.PLAIN, 20));
        panel.add(genderOptionLabel);

        // adding activityLevel options
        String listofActivityLevel[] = {ActivityLevelEnum.SEDENTARY.stringValue,
            ActivityLevelEnum.LIGHTLY.stringValue, 
            ActivityLevelEnum.MODERATELY.stringValue,
            ActivityLevelEnum.EXTRA_ACTIVE.stringValue,
            ActivityLevelEnum.VERY_ACTIVE.stringValue};
        activityLevelOption = new JComboBox<>(listofActivityLevel);
        activityLevelOption.setBounds(400, 500, 275, 50);
        panel.add(activityLevelOption);

        // adding activity level label
        activityLeveLabel = new JLabel("Activity Level");
        activityLeveLabel.setBounds(400, 470, 200, 40);
        activityLeveLabel.setFont(new Font(activityLeveLabel.getName(), Font.PLAIN, 20));
        panel.add(activityLeveLabel);

        //adding login button
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        signUpButton.setBounds(200, 600, 350, 50);
        panel.add(signUpButton);

        // setting of icon
        ImageIcon health_fitness_icon = new ImageIcon("Icons/health_fitness_icon.png");
        this.setIconImage(health_fitness_icon.getImage());

        // adding everything to everything
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String username = usernameTextField.getText();
        String password = new String(passwordTextField.getPassword());
        String confirmPassword = new String(confirmPasswordTextField.getPassword());
        int age = Integer.parseInt(ageTextField.getText());
        int height = Integer.parseInt(heightTextField.getText());

        if (password.equals(confirmPassword)==true){

            GenderEnum chosenGender = null;
            if (genderOption.getSelectedItem().equals(GenderEnum.FEMALE.label)){chosenGender = GenderEnum.FEMALE;}
            else {chosenGender = GenderEnum.MALE;}


            ActivityLevelEnum chosenActivityLevel = null;
            if (activityLevelOption.getSelectedItem().equals(ActivityLevelEnum.SEDENTARY.stringValue)){chosenActivityLevel=ActivityLevelEnum.SEDENTARY;}
            else if (activityLevelOption.getSelectedItem().equals(ActivityLevelEnum.LIGHTLY.stringValue)){chosenActivityLevel=ActivityLevelEnum.LIGHTLY;}
            else if (activityLevelOption.getSelectedItem().equals(ActivityLevelEnum.MODERATELY.stringValue)){chosenActivityLevel=ActivityLevelEnum.MODERATELY;}
            else if (activityLevelOption.getSelectedItem().equals(ActivityLevelEnum.VERY_ACTIVE.stringValue)){chosenActivityLevel=ActivityLevelEnum.VERY_ACTIVE;}
            else if (activityLevelOption.getSelectedItem().equals(ActivityLevelEnum.EXTRA_ACTIVE.stringValue)){chosenActivityLevel=ActivityLevelEnum.EXTRA_ACTIVE;}


            boolean signUpStatus = guiInterface.mainInterface.signUP(username,
                password,
                firstName,
                lastName,
                age,
                height,
                chosenGender,
                chosenActivityLevel);

            if (signUpStatus == true) {
                System.out.println("signed up");
                guiInterface.changeStage(StageEnum.LoginPage);
            } else if (signUpStatus == false) {
                System.out.println("signup failed");
            }
        }

        else {
            JLabel passNotSame = new JLabel("PLEASE MAKE SURE PASSWORD IS THE SAME");
            passNotSame.setBounds(300, 550, 400, 30);
            passNotSame.setFont(new Font(activityLeveLabel.getName(), Font.PLAIN, 30));
            panel.add(passNotSame);
            this.setVisible(true);
        }
    }
    
}
