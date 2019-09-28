package real_class;

import utils.Pet;

public class Snake extends Pet.ColdBloodedPet {
    public Snake(String foodType) {
        super(foodType);
    }

    @Override
    public String feed() {
        return "Snake eats 20 grams "+this.getFoodType();
    }
}
