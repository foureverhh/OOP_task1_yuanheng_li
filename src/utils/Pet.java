package utils;

import eums.PetsInHotel;
import real_class.Cat;
import real_class.Dog;
import real_class.Snake;

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
        String petName = JOptionPane.showInputDialog(null,
                "Input a pet name:"
                ,"Pet Name"
                ,JOptionPane.INFORMATION_MESSAGE);

        PetsInHotel petChosen = null;

            while(true){
                try {
                    petChosen = Enum.valueOf(PetsInHotel.class,petName.toUpperCase());
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
                    pet = new Dog(PetsInHotel.DOGGE.getWeight(), PetsInHotel.DOGGE.getFoodType());
                    pet.feed();
                    break;
                case SIXTEN:
                    pet = new Cat(PetsInHotel.SIXTEN.getWeight(), PetsInHotel.SIXTEN.getFoodType());
                    pet.feed();
                    break;
                case OVE:
                    pet = new Cat(PetsInHotel.OVE.getWeight(), PetsInHotel.OVE.getFoodType());
                    pet.feed();
                    break;
                case VENUS:
                    pet = new Cat(PetsInHotel.VENUS.getWeight(), PetsInHotel.VENUS.getFoodType());
                    pet.feed();
                    break;
                case HYPNO:
                    pet = new Snake(PetsInHotel.HYPNO.getFoodType());
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
