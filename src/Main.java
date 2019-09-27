import eums.AnimalsInHotel;
import eums.FoodType;
import utils.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(AnimalsInHotel.DOG_DOGGE.getWeight(), FoodType.DOG_FOOD.getFoodType());
        animal1.eat();
        Animal animal2 = new Cat(AnimalsInHotel.CAT_VENUS.getWeight(),FoodType.CAT_FOOD.getFoodType());
        animal2.eat();
        Animal animal3 = new Snake(FoodType.SNAKE_FOOD.getFoodType());
        animal3.eat();
    }
}
