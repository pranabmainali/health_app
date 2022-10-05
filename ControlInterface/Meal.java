package ControlInterface;
import java.util.ArrayList;

public class Meal {
    private ArrayList<Food> meal;
    private String mealName;
    private int totalCalories;
    private int totalProtien;
    private int totalCarb;
    private int totalFat;

    public Meal(String mealName){
        meal = new ArrayList<>();
        this.mealName = mealName;
    }  


    /**
     * adds the requested food item to the meal and updates nutritional info for meal
     * @param foodItem - the food item to be added to the meal
     */
    public void addFood(Food foodItem){
        meal.add(foodItem);
        totalCalories = totalCalories + foodItem.getCalorie();
        totalProtien = totalProtien + foodItem.getProtien();
        totalCarb = totalCarb + foodItem.getCarb();
        totalFat = totalFat + foodItem.getFat();
    }


    /**
     * removes the requested food item to the meal and updates nutritional info for meal
     * @param i - the index at which the food item to be removed is located
     */
    public void removeFood(int i){
        meal.remove(i);
        totalCalories = totalCalories - meal.get(i).getCalorie();
        totalProtien = totalProtien - meal.get(i).getProtien();
        totalCarb = totalCarb - meal.get(i).getCarb();
        totalFat = totalFat - meal.get(i).getFat();
    }


// GETTERS

    public String getMealName(){
        return mealName;
    }

    public int getTotalCalories(){
        return totalCalories;
    }

    public int getTotalProtien(){
        return totalProtien;
    }

    public int getTotalCarbs(){
        return totalCarb;
    }

    public int getTotalFat(){
        return totalFat;
    }
    
}
