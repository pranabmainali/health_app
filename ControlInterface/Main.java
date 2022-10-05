package ControlInterface;

import GUI.MainGUIInterface;

public class Main {

    public static void main(String args[]) {
        MainInterface mainInterface = new MainInterface();
        MainGUIInterface guiInterface = new MainGUIInterface(mainInterface);
    }
}
