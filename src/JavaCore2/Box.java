package JavaCore2;

import java.util.ArrayList;
import java.util.Collection;

public class Box <F> {
    ArrayList<F> fruits = new ArrayList();
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

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }
    public void transfer(Box<F> anotherBox){
        this.fruits.addAll((Collection<? extends F>) anotherBox.fruits);
        anotherBox.fruits.clear();
    }


}
