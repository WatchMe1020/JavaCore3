package JavaCore2;

import java.util.ArrayList;
import java.util.Collection;

public class Box <T extends Fruit> {
    ArrayList<T> fruits = new ArrayList();
    private float weightFruit;


    public <F> Box(float weightFruit){
        this.weightFruit = weightFruit;
    }

    public float getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<? extends Fruit> anotherBox){
        return getBoxWeight() == anotherBox.getBoxWeight();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }


    public void transfer(Box<T> anotherBox) {
        this.fruits.addAll(anotherBox.fruits);
    }
}
