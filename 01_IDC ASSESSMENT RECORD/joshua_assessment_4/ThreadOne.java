package joshua_assessment_4;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("one ");
        }
    }
}
