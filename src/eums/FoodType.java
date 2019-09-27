package eums;

public enum FoodType {
    CAT_FOOD("cat food"), DOG_FOOD("dog food"), SNAKE_FOOD("snake food");

    private String foodType;

    FoodType (String foodType){
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
}
