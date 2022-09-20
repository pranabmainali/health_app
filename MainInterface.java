import java.util.ArrayList;

public class MainInterface {
    FoodInterface foodInterface;
    ExerciseInterface exerciseInterface;
    UserInterface userInterface;
    ArrayList <User> listOfUsers;

    public MainInterface() {
        foodInterface = new FoodInterface(this);
        exerciseInterface = new ExerciseInterface(this);
        userInterface = new UserInterface(this);
        listOfUsers = new ArrayList<>();
    }

    /**
     * login method for login button
     * @parameter String username, String password
     * @returns boolean, True if there is an account and both username and password are proper, Flase if otherwise
     *
     */
    public boolean logIn(String username, String password) {
        if (listOfUsers.isEmpty()!=false){
            for (int i = 0; i<listOfUsers.size(); i++){
                if (listOfUsers.get(i).getUserName().equals(username)){
                    if (listOfUsers.get(i).getPassword().equals(password))
                        return true;
                }
            }
        }

        return false;
    }

    /**
     * login method for login button
     * @parameter String username, String password
     * @returns boolean, True if there is an account and both username and password are proper, Flase if otherwise
     *
     */
    public boolean signUP(String username, String password) {
        

        return false;
    }

}
