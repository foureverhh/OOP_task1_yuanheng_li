import eums.PetsInHotel;
import real_class.Cat;
import real_class.Dog;
import real_class.Snake;
import utils.Pet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pet pet = Pet.getProperPet();
        String petFood = pet.feed();
        JOptionPane.showMessageDialog(null, petFood, "Pet food", JOptionPane.INFORMATION_MESSAGE);



        /*   for(PetsInHotel a: PetsInHotel.values()){
            System.out.println(a);

        }
        //Pet pet1 = new Dog(AnimalsInHotel.DOG_DOGGE.getWeight(), FoodType.DOG_FOOD.getFoodType());
        Pet pet1 = new Dog(PetsInHotel.DOG_DOGGE.getWeight(), PetsInHotel.DOG_DOGGE.getFoodType());
        System.out.println(pet1.feed());

        //Pet pet2 = new Cat(AnimalsInHotel.CAT_VENUS.getWeight(),FoodType.CAT_FOOD.getFoodType());
        Pet pet2 = new Cat(PetsInHotel.CAT_VENUS.getWeight(), PetsInHotel.CAT_VENUS.getFoodType());
        System.out.println(pet2.feed());

        Pet pet3 = new Snake(PetsInHotel.SNAKE_HYPNO.getFoodType());
        System.out.println(pet3.feed());*/

    }


}
