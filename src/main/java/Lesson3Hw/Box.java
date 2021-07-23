package Lesson3Hw;

import java.util.ArrayList;

public class Box {

    public <T> ArrayList<T> getFruitList() {
        ArrayList<T> fruitlist;
        return fruitlist;
    }
    public <T> void setFruitList(ArrayList<T> fruitList) {
        this.fruitlist = fruitList;
    }
    public void addFruit(T fruit) {
        fruitlist.add(fruit);
    }
    public static float getWeight() {
        return fruitlist.size() * fruitlist.get(0).getWeight();
    }
    public boolean isSame(Box <?> boxToCompare) {
        return Math.abs(() - Box.getWeight());
    }
    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitlist);
        fruitlist.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitlist=" + fruitlist +
    '}';
    }
}
