public class Food {
    private String name;
    private int calorie;
    private int protien;
    private int carb;
    private int fat;
    
    public Food(String name, 
        int calorie,
        int protien,
        int carb,
        int fat){

            this.name = name;
            this.calorie = calorie;
            this.protien = protien;
            this.carb = carb;
            this.fat = fat;
    }

    public String getName(){
        return name;
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
