package GUI;

import ControlInterface.*;

public class MainGUIInterface {

    public MainInterface mainInterface;

    public MainGUIInterface(MainInterface mainInterface){
        this.mainInterface = mainInterface;
        LoginFrame loginFrame = new LoginFrame(this);
        //SignUpFrame signUpFrame = new SignUpFrame(this);
        //run();
    }

    public void run(){

    }



}
