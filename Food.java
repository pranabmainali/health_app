
public class Food {
    private String foodName;
    private int calorie;
    private int protien;
    private int carb;
    private int fat;
    
    public Food(String name, 
        int calorie,
        int protien,
        int carb,
        int fat){

            this.foodName = name;
            this.calorie = calorie;
            this.protien = protien;
            this.carb = carb;
            this.fat = fat;
    }

    // GETTERS

    public String getName(){
        return foodName;
    }

    public int getCalorie(){
        return calorie;
    }

    public int getProtien(){
        return protien;
    }

    public int getCarb(){
        return carb;
    }

    public int getFat(){
        return fat;
    }
}
