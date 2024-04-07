package Matrix;

public class ThreadA extends Thread {
    @Override
    public void run() {

        for (int i = 1; i < 50; i++) {

            if (Matrix.canvas > 9) {
                Matrix.canvas = 0;
                System.out.print("\n");
            } else {
                System.out.print("1 ");
                Matrix.canvas++;
            }
        }
    }
}
