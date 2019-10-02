package concrete_class;

import utils.Pet;

import javax.swing.*;

public class Cat extends Pet.WarmBloodedPet {
    public Cat(int weight, String foodType) {
        super(weight, foodType);
    }

    @Override
    public void feed() {
        int portions = this.getWeight() * 1000 /150;
        JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" grams "+this.getFoodType());
    }
}
