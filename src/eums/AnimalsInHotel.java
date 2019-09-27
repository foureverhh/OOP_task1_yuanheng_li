package eums;

public enum AnimalsInHotel {
    DOG_SIXTEEN(5),DOG_DOGGE(10),
    CAT_VENUS(5),  CAT_OVE(3),
    SNAKE(1);

    private int weight;

    AnimalsInHotel(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
