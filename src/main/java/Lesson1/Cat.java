package Lesson1;

public class Cat implements CanJump {
    private double jumpingHigth;

    public double getJumpingHigth() {
        return jumpingHigth;
    }

    public void setJumpingHigth(double jumpingHigth) {
        this.jumpingHigth = jumpingHigth;

    }


    public double jump(Wall wall) {
        return 0;
    }

    @Override
    public double jump(int height) {
        return 0;
    }
}
