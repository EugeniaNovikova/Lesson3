package Lesson1;

public class Wall {
    private double hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public double getTimeToOvercome(CanJump jumper) {
        double jump = jumper.jump(this);
        return jump;
    }

}
