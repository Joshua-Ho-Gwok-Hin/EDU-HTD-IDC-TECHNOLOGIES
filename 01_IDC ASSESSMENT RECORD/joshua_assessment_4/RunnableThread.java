package joshua_assessment_4;

public class RunnableThread {

    public static void main(String[] args) {

        Thread one = new ThreadOne();
        Thread two = new ThreadTwo();
        Thread three = new ThreadThree();

        one.start();
        two.start();
        three.start();

        System.out.println("***********");

        Runnable loopingMethod = RunnableThread::looping;
        loopingMethod.run();

        System.out.println("***********");

        Runnable anotherLoopMethod = RunnableThread::anotherLoop;
        anotherLoopMethod.run();
    }

    static void looping() {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("a ");
        }
    }

    static void anotherLoop() {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("b ");
        }
    }
}
