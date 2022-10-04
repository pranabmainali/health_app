import java.util.ArrayList;

public class User {

    //declaring and initializing some local variables for the user class

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private GENDER gender;
    private ActivityLevelEnum activityLevel;
    private ArrayList<Meal> meals;
    
    //constructor of the user class
    public User(String username,
        String password,
        String firstname,
        String lastname, 
        int age,
        int height,
        GENDER gender,
        ActivityLevelEnum activityLevel){
            this.userName = username;
            this.password = password;
            this.firstName = firstname;
            this.lastName = lastname;
            this.age = age;
            this.height = height;
            this.gender = gender;
            this.activityLevel = activityLevel;
    }

//SETTERS -------------------------------------------------------------------------------------    

    /**
     * 
     * @param username
     * @return true after changing the first name of the user
     */
    public boolean changeUserName(String userName){
        this.userName = userName;
        return true;
    }

    /**
     * 
     * @param password
     * @return true after changing the first name of the user
     */
    public boolean changePassword(String password){
        this.password = password;
        return true;
    }

    /**
     * @param firstname
     * @return true after changing the first name of the user
     */
    public boolean changeFirstName(String firstname){
        this.firstName = firstname;
        return true;
    }

    /**
     * 
     * @param lastname
     * @return true after changing the last name of the user
     */
    public boolean changeLastName(String lastname){
        this.lastName = lastname;
        return true;
    }

    /**
     * 
     * @param age
     * @return true after changing the age of the user
     */
    public boolean changeAge(int age){
        this.age = age;
        return true;
    }

    /**
     * 
     * @param height
     * @return true after changing the height of the user
     */
    public boolean changeHeight(int height){
        this.height = height;
        return true;
    }

    /**
     * 
     * @param gender
     * @return true after changing the gender of the user
     */
    public boolean changeGender(GENDER gender){
        this.gender = gender;
        return true;
    }

    /**
     * 
     * @param activityLevel
     * @return true after changing the actitivity Level of the user
     */
    public boolean changeActivityLevel(ActivityLevelEnum activityLevel){
        this.activityLevel = activityLevel;
        return true;
    }

//GETTERS -----------------------------------------------------------------------------

    /**
     * 
     * @param none
     * @return username
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 
     * @param none
     * @return password
     */
    public String getPassword(){
        return password;
    }

    /**
     * 
     * @param none
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * 
     * @param none
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * 
     * @param none
     * @return user's age
     */
    public int getAge(){
        return age;
    }

    /**
     * 
     * @param none
     * @return user's height
     */
    public int getHeight(){
        return height;
    }

    /**
     * 
     * @param none
     * @return user's gender
     */
    public GENDER getGender(){
        return gender;
    }

    /**
     * 
     * @param none
     * @return user's activity level
     */
    public ActivityLevelEnum getActivityLevel(){
        return activityLevel;
    }
}
