
import utils.Animal;

public class Dog extends Animal.WarmBloodedAnimal {


    public Dog(int weight, String foodType) {
        super(weight,foodType);
    }

    @Override
    public void eat() {
        System.out.println("This dog eats "+this.getFoodType()+", and weight is: "+this.getWeight());
    }

}

