package fruit;

import edible.Edible;

public abstract class Fruit implements Edible {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (int i =0;i<fruit.length;i++){
            System.out.println(fruit[i].howToEat());
        }
    }

}
