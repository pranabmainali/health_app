import java.util.ArrayList;
import java.util.Scanner;

public class MainInterface {
    FoodInterface foodInterface;
    ExerciseInterface exerciseInterface;
    UserInterface userInterface;
    ArrayList<User> listOfUsers;
    User currentUser;

    public MainInterface() {
        foodInterface = new FoodInterface(this);
        exerciseInterface = new ExerciseInterface(this);
        userInterface = new UserInterface(this);
        listOfUsers = new ArrayList<>();
        run();
    }

    /**
     * login method for login button
     * 
     * @parameter String username, String password
     * @returns boolean, True if there is an account and both username and password
     *          are proper, False if otherwise
     *
     */
    public boolean logIn(String username, String password) {
        if (listOfUsers.isEmpty() != false) {
            for (int i = 0; i < listOfUsers.size(); i++) {
                if (listOfUsers.get(i).getUserName().equals(username)) {
                    if (listOfUsers.get(i).getPassword().equals(password))
                        return true;
                }
            }
        }

        return false;
    }

    /**
     * login method for signUp button
     * 
     * @parameter String username, String password, String firstname, String
     *            lastname,
     *            int age, int height, GENDER gender, ActivityLevelEnum
     *            activityLevel
     * @returns True if user inputs are valid (Adds the new user who wants to sign
     *          up into the list of existing users), otherwise returns False.
     *
     */
    public boolean signUP(String username,
            String password,
            String firstname,
            String lastname,
            int age,
            int height,
            GENDER gender,
            ActivityLevelEnum activityLevel) {

        if (height > 0 && age > 0) {
            User newUser = new User(username, password, firstname, lastname, age, height, gender, activityLevel);
            listOfUsers.add(newUser);
            return true;
        }

        return false;
    }

    /**
     * simple run function to see if current login function works
     */
    public void run() {

        User newUser = new User("pmainali",
                "idk",
                "Pranab",
                "Mainali",
                20,
                188,
                GENDER.MALE,
                ActivityLevelEnum.VERY_ACTIVE);
        listOfUsers.add(newUser);

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("press 1 to sign in, 2 to sign up");
            String loginInput = myObj.nextLine();

            if (loginInput.equals("1")) {
                System.out.println("Username : ");
                String username = myObj.nextLine();

                System.out.println("Password : ");
                String password = myObj.nextLine();

                for (int i = 0; i < listOfUsers.size(); i++) {
                    if (listOfUsers.get(i).getUserName().equals(username)) {
                        if (listOfUsers.get(i).getPassword().equals(password))
                            currentUser = listOfUsers.get(i);
                        else
                            System.out.println("Wrong username or password");

                    } else
                        System.out.println("Wrong username");
                }

            }

        }
    }

}
