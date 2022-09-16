
public class MainInterface {
    FoodInterface foodInterface;
    ExerciseInterface exerciseInterface;
    UserInterface userInterface;

    public MainInterface() {
        foodInterface = new FoodInterface(this);
        exerciseInterface = new ExerciseInterface(this);
        userInterface = new UserInterface(this);

    }

    /**
     * login method for login button
     * @parameter String username, String password
     * @returns boolean, True if there is an account and both username and password are proper, Flase if otherwise
     *
     */
    public boolean LogIn(String username, String password) {
        return false;

    }

}
