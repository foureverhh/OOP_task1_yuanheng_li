import eums.FoodType;
import utils.Animal;

public class Snake extends Animal.ColdBloodedAnimal {
    public Snake(String foodType) {
        super(foodType);
    }

    @Override
    public void eat() {
        System.out.println("Snake eats "+this.getFoodType());
    }
}
