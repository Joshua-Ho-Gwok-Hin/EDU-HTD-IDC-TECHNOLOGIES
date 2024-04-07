package joshua_assessment_4;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("TWO ");
        }
    }
}

