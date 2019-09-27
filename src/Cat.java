import eums.FoodType;
import utils.Animal;

public class Cat extends Animal.WarmBloodedAnimal {
    public Cat(int weight, String foodType) {
        super(weight, foodType);
    }

    @Override
    public void eat() {
        System.out.println("This cat eats "+this.getFoodType()+", and weight is: "+this.getWeight());
    }
}
