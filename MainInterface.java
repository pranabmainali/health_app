public class MainInterface {
    FoodInterface foodInterface;
    ExerciseInterface exerciseInterface;
    UserInterface userInterface;

    public MainInterface() {
        System.out.println("hello world");
        foodInterface = new FoodInterface(this);
        exerciseInterface = new ExerciseInterface(this);
        userInterface = new UserInterface(this);

    }

    /**
     * login method
     * param - username, and password input
     * returns boolean - depending is username and password match
     */
    public boolean LogIn(String username, String password) {
        return false;

    }

}
