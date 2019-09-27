package utils;

import eums.FoodType;

public class Animal implements AnimalEat {

    private int weight;
    private String foodType;

    @Override
    public void eat() {

    }

    public Animal(){

    }

    public Animal(String foodType){
        this.foodType = foodType;
    }

    public Animal(int weight,String foodType){
        this(foodType);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getWeight() {
        return weight;
    }

    public String getFoodType() {
        return foodType;
    }

    public static class WarmBloodedAnimal extends Animal{
        public WarmBloodedAnimal(int weight,String foodType){
            super(weight,foodType);
        }

    }

    public static class ColdBloodedAnimal extends Animal{
        public ColdBloodedAnimal(String foodType){
            super(foodType);
        }
    }
}
