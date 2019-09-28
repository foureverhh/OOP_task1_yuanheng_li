package eums;

public enum PetsInHotel {
    DOG_SIXTEN(5,"dog food"),DOG_DOGGE(10,"dog food"),
    CAT_VENUS(5,"cat food"),  CAT_OVE(3,"cat food"),
    SNAKE_HYPNO(1,"snake food");

    private int weight;
    private String foodType;

    PetsInHotel(int weight, String foodType){
        this.weight = weight;
        this.foodType = foodType;
    }

    public int getWeight() {
        return weight;
    }

    public String getFoodType() {
        return foodType;
    }
}
