package concrete_class;

import utils.ColdbloodedPet;

import javax.swing.*;

public class Snake extends ColdbloodedPet {
    public Snake(String foodType) {
        super(foodType);
    }

    @Override
    public void feed() {
        JOptionPane.showMessageDialog(null,this.getClass().getSimpleName()+" eats 20 grams "+this.getFoodType()+" per portion");
    }
}
