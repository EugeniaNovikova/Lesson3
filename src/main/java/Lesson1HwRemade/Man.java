package Lesson1HwRemade;

public class Man implements Competitable {
    private int jumpHeight;
    private int runLenght;

    public Man (int jumpHeight, int runLenght) {
        this.jumpHeight = jumpHeight;
        this.runLenght = runLenght;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println(" Я человек, я плохо тренировалсяя, не смог прыгнуть так высоко!");
        } else {
            System.out.println("Я человек, я смог перепрыгнуть, УРА!");
        }

    }

    @Override
    public void run(int lenght) {
        if (lenght > runLenght) {
            System.out.println("Я человек, я устал, я не смог пробежать такую дистанцию!");
        } else {
            System.out.println("Я человек, я сильный и смог пробежать такую огромную дистанцию, УРА!");
        }

    }

    @Override
    public void jumpn(int height) {

    }
}
