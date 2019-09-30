package real_class;

import utils.Pet;

import javax.swing.*;

public class Dog extends Pet.WarmBloodedPet {


    public Dog(int weight, String foodType) {
        super(weight,foodType);
    }
    @Override
    public void feed() {
        int portions = this.getWeight() * 1000 /100;
        JOptionPane.showMessageDialog(null,"This "+this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" portions "+this.getFoodType());
    }

}

