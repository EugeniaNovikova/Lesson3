package Lesson1HwRemade;

public class Main {
    public static void main(String[] args) {
        Competitable[] competitors = {new Man(3,2), new Robor(5,7),
                new Cat(4,10)};

        Overcomable[] overcomables = {new Wall(5), new Road(11)};

        for (Competitable competitable : competitors) {
            for (Overcomable overcomable : overcomables) {
                overcomable.overcome(competitable);
            }
        }

    }
}
