package real_class;

import utils.Pet;

public class Cat extends Pet.WarmBloodedPet {
    public Cat(int weight, String foodType) {
        super(weight, foodType);
    }

    @Override
    public String feed() {
        int portions = this.getWeight() * 1000 /150;
        return "This "+this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" portions "+this.getFoodType();
    }
}
