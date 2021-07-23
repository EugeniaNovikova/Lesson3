package Lesson1HwRemade;

public class Cat implements Competitable {
    private int jumpHeight;
    private int runLenght;

public Cat (int jumpHeight, int runLenght){
    this.jumpHeight = jumpHeight;
    this.runLenght = runLenght;
}


    @Override
    public void jump(int height) {
    if (height > jumpHeight){
        System.out.println("Я всего лишь кот, а не пружина, я не смог прыгнуть так высоко!");
    } else {
        System.out.println("Я кот и я умею прыгать высоко, я смог!");
    }

    }

    @Override
    public void run(int lenght) {
    if (lenght > runLenght) {
        System.out.println("Я кот, меня не покормили и я устал, сами бегайте, лысые мешки!");
    } else {
        System.out.println("Я молодой кот и я пробежал, потому что я круче людей!");
    }

    }

    @Override
    public void jumpn(int height) {

    }
}
