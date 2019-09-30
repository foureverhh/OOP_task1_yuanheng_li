package eums;

public enum PetsInHotel {
    SIXTEN(5,"dog food"), DOGGE(10,"dog food"),
    VENUS(5,"cat food"),  OVE(3,"cat food"),
    HYPNO(1,"snake food");

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
