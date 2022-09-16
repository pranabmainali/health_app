public class User {

    //declaring and initializing some local variables for the user class

    String firstName;
    String lastName;
    int age;
    int height;
    GENDER gender;
    ActivityLevelEnum activityLevel;
    
    //constructor of the user class
    public User(String firstname,
        String lastname, 
        int age,
        int height,
        GENDER gender,
        ActivityLevelEnum activityLevel){
            this.firstName = firstname;
            this.lastName = lastname;
            this.age = age;
            this.height = height;
            this.gender = gender;
            this.activityLevel = activityLevel;
    }

    //methods 
    
    /**
     * 
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
}
