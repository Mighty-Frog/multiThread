package createMultiThread;

public class test0 {

    public static void main(String[] args) {
        Thread myTread = new MyThread();
        myTread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(
                "Hello myThread"
                + this.getName()
        );
    }
}
