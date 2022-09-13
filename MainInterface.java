public class MainInterface {
    FoodInterface foodInterface;
    ExerciseInterface exerciseInterface;
    UserInterface userInterface;

    public MainInterface() {
        foodInterface = new FoodInterface(this);
        exerciseInterface = new ExerciseInterface(this);
        userInterface = new UserInterface(this);

    }
}
