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

//SETTERS -------------------------------------------------------------------------------------    

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

//GETTERS -----------------------------------------------------------------------------


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
