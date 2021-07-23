package Lesson1HwRemade;

public class Road implements Overcomable {
    private int lenght;

    public Road (int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void overcome(Competitable competitable) {
        competitable.run(lenght);
    }
}
