package utils;

import eums.PetsInHotel;
import concrete_class.Cat;
import concrete_class.Dog;
import concrete_class.Snake;

import javax.swing.*;

public class Pet implements PetFeeder {

    private int weight;
    private String foodType;

    @Override
    public void feed() {

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

    public static void getProperPet(){
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

    public static class WarmBloodedPet extends Pet {
        public WarmBloodedPet(int weight, String foodType){
            super(weight,foodType);
        }
    }

    public static class ColdBloodedPet extends Pet {
        public ColdBloodedPet(String foodType){
            super(foodType);
        }
    }
}
