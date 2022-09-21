
import java.util.ArrayList;


public class FoodInterface {
    MainInterface mainInterface;
    ArrayList<Meal> meals;
    
    //CONSTRUCTOR
    public FoodInterface(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        meals = new ArrayList<>();

    }

    //methods 
    /**
     * @parameter meal, an object of type Meal
     * @returns none, appends the meal in question to the arraylist of meal
     */
    public void addMeal(Meal meal){


    }
}
