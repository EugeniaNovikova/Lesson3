package Lesson1;

public class Robot implements CanJump {
    private double jumpingHigth;

    public double getJumpingHigth() {
        return jumpingHigth;
    }

    public void setJumpingHigth(double jumpingHigth) {
        this.jumpingHigth = jumpingHigth;
    }

    @Override
    public double jump(Wall wall) {
        return 0;
    }
}
