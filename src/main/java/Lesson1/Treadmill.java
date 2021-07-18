package Lesson1;

public class Treadmill {
    private double length;

    private Treadmill(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
