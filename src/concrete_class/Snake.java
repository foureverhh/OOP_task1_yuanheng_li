package concrete_class;

import utils.Pet;

import javax.swing.*;

public class Snake extends Pet.ColdBloodedPet {
    public Snake(String foodType) {
        super(foodType);
    }

    @Override
    public void feed() {
        JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" eats 20 grams "+this.getFoodType());
    }
}
