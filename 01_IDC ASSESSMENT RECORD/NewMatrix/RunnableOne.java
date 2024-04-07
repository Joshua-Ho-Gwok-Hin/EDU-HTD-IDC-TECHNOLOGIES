package NewMatrix;

public class RunnableOne implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (NewMatrix.row > 10) {
                System.out.println();
                NewMatrix.row = 0;
            }else
                System.out.print("1 ");
            NewMatrix.row++;
        }
    }
}
