package Lesson3Hw;

public class Main {
    public static void main(String[] args) {

    }
    public static void changeArrElement(Object[] array, int a, int b) {
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
