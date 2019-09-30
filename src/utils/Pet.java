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
    public String feed() {
        return "";
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

    public static Pet getProperPet(){
        Pet pet = null;
        String petName = JOptionPane.showInputDialog(null,
                "Input a pet name:"
                ,"Pet Name"
                ,JOptionPane.INFORMATION_MESSAGE);

        while(pet==null) {
            //To make sure pet name should not be empty
            while(true) {
                if (petName == null){
                    System.exit(0);
                }
                if (petName.trim().length()==0) {
                //if(petName == null ){
                    petName = JOptionPane.showInputDialog("Your input does not match, input a pet name again:");
                }else {
                    break;
                }
            }
            PetsInHotel petChosen = null;

            while(true){
                try {
                    petChosen = Enum.valueOf(PetsInHotel.class,petName.toUpperCase());
                    break;
                }catch (Exception e){
                    petName = JOptionPane.showInputDialog("Your input does not match, input a pet name again:");
                }
            }

            System.out.println(petChosen);
            switch (petChosen){
                case DOGGE:
                    pet = new Dog(PetsInHotel.DOGGE.getWeight(), PetsInHotel.DOGGE.getFoodType());
                    break;
                case SIXTEN:
                    pet = new Cat(PetsInHotel.SIXTEN.getWeight(), PetsInHotel.SIXTEN.getFoodType());
                    break;
                case OVE:
                    pet = new Cat(PetsInHotel.OVE.getWeight(), PetsInHotel.OVE.getFoodType());
                    break;
                case VENUS:
                    pet = new Cat(PetsInHotel.VENUS.getWeight(), PetsInHotel.VENUS.getFoodType());
                    break;
                case HYPNO:
                    pet = new Snake(PetsInHotel.HYPNO.getFoodType());
                    break;
            }
            /*
            if (petName.toLowerCase().endsWith("dogge")) {
                pet = new Dog(PetsInHotel.DOGGE.getWeight(), PetsInHotel.DOGGE.getFoodType());
            }
            if (petName.toLowerCase().endsWith("sixten")) {
                pet = new Cat(PetsInHotel.SIXTEN.getWeight(), PetsInHotel.SIXTEN.getFoodType());
            }
            if (petName.toLowerCase().endsWith("venus")) {
                pet = new Cat(PetsInHotel.VENUS.getWeight(), PetsInHotel.VENUS.getFoodType());
            }
            if (petName.toLowerCase().endsWith("ove")) {
                pet = new Cat(PetsInHotel.OVE.getWeight(), PetsInHotel.OVE.getFoodType());
            }
            if (petName.toLowerCase().endsWith("hynpo")) {
                pet = new Snake(PetsInHotel.HYPNO.getFoodType());
            }
            */
            petName = "";
        }
        //JOptionPane.showMessageDialog(null,pet.feed());

        return pet;
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
