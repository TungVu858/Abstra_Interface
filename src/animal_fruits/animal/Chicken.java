package animal_fruits.animal;

import animal_fruits.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken : o ó o";
    }
    @Override
    public String howToEat(){
        return "Gà ăn shit";
    }
}
