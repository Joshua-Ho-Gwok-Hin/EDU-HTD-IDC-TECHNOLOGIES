package Matrix;

public class Matrix {

    public static int canvas=0;

    public static void main(String[] args) {

        Thread a = new ThreadA();
        Thread b = new ThreadB();

        a.start();
        b.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
