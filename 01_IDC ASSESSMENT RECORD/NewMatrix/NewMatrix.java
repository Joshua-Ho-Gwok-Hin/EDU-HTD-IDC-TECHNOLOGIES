package NewMatrix;

public class NewMatrix {

    static int row;

    public static void main(String[] args) {

        (new Thread(new RunnableOne())).start();

        Thread zero = new Thread(new RunnableZero());
        zero.start();

    }
}
