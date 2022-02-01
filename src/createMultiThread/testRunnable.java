package createMultiThread;

public class testRunnable {

    public static void main(String[] args) {
        Runnable myTread = new MyRunnable();
        myTread.run();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(
                "Hello myThread "
                        + Thread.currentThread().getName()
        );
    }
}
