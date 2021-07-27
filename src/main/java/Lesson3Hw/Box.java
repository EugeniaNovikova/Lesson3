package Lesson3Hw;

import java.util.ArrayList;

public class Box {

    public <T> ArrayList<T> getFruitList() {
        ArrayList<T> fruitList;
        return fruitList;
    }
    public <T> void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }
    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }
    public static float getWeight() {
        return fruitlist.size() * fruitList.get(0).getWeight();
    }
    public boolean isSame(Box <?> boxToCompare) {
        return Math.abs(() - Box.getWeight());
    }
    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitlist=" + fruitList +
    '}';
    }
}
