package Lesson1HwRemade;

public class Robor implements Competitable {
    private int jumpHeight;
    private int runLenght;

    public Robor(int jumpHeight, int runLenght) {
        this.jumpHeight = jumpHeight;
        this.runLenght = runLenght;
    }


    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я робот, меня не для этого создавали, я не смог так высоко прыгнуть!");
        } else {
            System.out.println("Я робот, я умею прыгать высоко, я смог прыгнуть!");
        }

    }

    @Override
    public void run(int lenght) {
        if (lenght > runLenght) {
            System.out.println("Я робот, меня не смазали, я не смог пробежать!");
        } else {
            System.out.println("Я робот, я порабощу ваш мир, я уже бегаю дольше вас!");
        }

    }

    @Override
    public void jumpn(int height) {

    }
}
