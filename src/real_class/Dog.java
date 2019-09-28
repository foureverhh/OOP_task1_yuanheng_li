package real_class;

import utils.Pet;

public class Dog extends Pet.WarmBloodedPet {


    public Dog(int weight, String foodType) {
        super(weight,foodType);
    }
    @Override
    public String feed() {
        int portions = this.getWeight() * 1000 /100;
        return "This "+this.getClass().getSimpleName()+" weighs "+this.getWeight()+" kg and eats " +portions +" portions "+this.getFoodType();
    }

}

