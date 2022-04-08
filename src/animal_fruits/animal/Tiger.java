package animal_fruits.animal;

import animal_fruits.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Tiger : roarrrrr";
    }
    @Override
    public String howToEat(){
        return "Tiger ăn Chicken";
    }
}
