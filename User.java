public class User {
    String firstName;
    String lastName;
    int age;
    int height;
    GENDER gender;
    ActivityLevelEnum activityLevel;
    
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

    public boolean changeFirstName(String firstname){
        this.firstName = firstname;
        return true;
    }
}
