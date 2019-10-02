package utils;

import eums.PetsInHotel;

import javax.swing.*;

public class Pet implements PetFeeder {

    private int weight;
    private String foodType;

    @Override
    public void feed() {

    }

    public Pet() {
    }

    public Pet(String foodType){
        this.foodType = foodType;
    }

    public Pet(int weight, String foodType){
        this(foodType);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getFoodType() {
        return foodType;
    }

    public void getProperPet(){
        Pet pet = null;
        PetsInHotel petChosen = null;

        String petName = JOptionPane.showInputDialog(null,
                "Input a pet name:"
                ,"Pet Name"
                ,JOptionPane.INFORMATION_MESSAGE);


        while(true){
            try {
                petChosen = Enum.valueOf(PetsInHotel.class,petName.trim().toUpperCase());
                break;
            }catch (Exception e){
                petName = JOptionPane.showInputDialog("Your input does not match, input a pet name again:");
                if (petName == null){
                    System.exit(0);
                }
            }
        }

        switch (petChosen){
            case DOGGE:
                pet = new Dog(PetsInHotel.DOGGE.weight, PetsInHotel.DOGGE.foodType);
                pet.feed();
                break;
            case SIXTEN:
                pet = new Cat(PetsInHotel.SIXTEN.weight, PetsInHotel.SIXTEN.foodType);
                pet.feed();
                break;
            case OVE:
                pet = new Cat(PetsInHotel.OVE.weight, PetsInHotel.OVE.foodType);
                pet.feed();
                break;
            case VENUS:
                pet = new Cat(PetsInHotel.VENUS.weight, PetsInHotel.VENUS.foodType);
                pet.feed();
                break;
            case HYPNO:
                pet = new Snake(PetsInHotel.HYPNO.foodType);
                pet.feed();
                break;
        }
    }

    public  class WarmBloodedPet extends Pet {
        public WarmBloodedPet(int weight, String foodType){
            super(weight,foodType);
        }
    }

    public  class ColdBloodedPet extends Pet {
        public ColdBloodedPet(String foodType){
            super(foodType);
        }
    }

    public class Dog extends WarmBloodedPet {
        public Dog(int weight, String foodType) {
            super(weight,foodType);
        }
        @Override
        public void feed() {
            int portions = this.getWeight() * 1000 /100;
            JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" grams "+this.getFoodType());
        }

    }
    public class Cat extends WarmBloodedPet {
        public Cat(int weight, String foodType) {
            super(weight, foodType);
        }

        @Override
        public void feed() {
            int portions = this.getWeight() * 1000 /150;
            JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" grams "+this.getFoodType());
        }
    }
    public class Snake extends ColdBloodedPet {
        public Snake(String foodType) {
            super(foodType);
        }

        @Override
        public void feed() {
            JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" eats 20 grams "+this.getFoodType());
        }
    }
}
