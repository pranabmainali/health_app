package GUI;

import ControlInterface.*;

public class MainGUIInterface {

    public MainInterface mainInterface;
    LoginFrame loginFrame;

    public MainGUIInterface(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        loginFrame = new LoginFrame(this);
        // run();
    }

    public void run() {

    }

    public void changeStage(StageEnum nextEnum) {
        if (nextEnum.equals(StageEnum.SignUpPage)) {
            SignUpFrame signUpFrame = new SignUpFrame(this);
        }
        else if (nextEnum.equals(StageEnum.LoginPage)) {
            SignUpFrame signUpFrame = new SignUpFrame(this);
            loginFrame.dispose();
        }
    }

}
