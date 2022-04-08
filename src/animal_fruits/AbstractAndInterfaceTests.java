package animal_fruits;

import animal_fruits.animal.Animal;
import animal_fruits.animal.Chicken;
import animal_fruits.animal.Tiger;
import animal_fruits.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
            if (animal instanceof Tiger){
                Edible edible = (Tiger) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
