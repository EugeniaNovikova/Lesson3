package Lesson1;

public class Main {
    public static void main(String[] args) {
Man man1 = new Man() {
    @Override
    public double jump(Wall wall) {
        return 0;
    }
};

Cat cat1 = new Cat();

Robot robot1 = new Robot();

// Создать набор стен,через которые будут прыгать участники соревнования

        Man manCompetitor = new Man() {
            private Wall wall;

            @Override
            public double jump(Wall wall) {
                this.wall = wall;
                return 0;
            }
        };
        Cat catCompetitor = new Cat();
        Robot robotCompetitor = new Robot();

        Wall[] walls = {new Wall(10),new Wall(20),new Wall(30)};
        for (Wall wall : walls) {
            wall.getTimeToOvercome(manCompetitor);
            wall.getTimeToOvercome(catCompetitor);
            wall.getTimeToOvercome(robotCompetitor);

        }

    }
}
