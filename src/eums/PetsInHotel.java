package eums;

public enum PetsInHotel {
    SIXTEN(5,FoodType.DOG_FOOD.foodType), DOGGE(10,FoodType.DOG_FOOD.foodType),
    VENUS(5,FoodType.CAT_FOOD.foodType),  OVE(3,FoodType.CAT_FOOD.foodType),
    HYPNO(1,FoodType.SNAKE_FOOD.foodType);

    public final int weight;
    public final String foodType;

    PetsInHotel(int weight, String foodType){
        this.weight = weight;
        this.foodType = foodType;
    }
}
