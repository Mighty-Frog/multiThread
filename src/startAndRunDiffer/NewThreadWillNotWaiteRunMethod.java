package startAndRunDiffer;

/**
 * 1. start will create a new thread and the origianl thread will keep running following codes
 * without waiting run() methoding in new thread.
 * 2. if only invoke run() without start(), it will not creat a new thread
 */
public class NewThreadWillNotWaiteRunMethod {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //first output
        System.out.println("nihao World");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        //second output logically, but not as shown after running
        thread.start();
        //third output
        System.out.println("nihao World");
    }

}

/**
 * The type My runnable.
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("nihao myRunnable" + Thread.currentThread().getName());
    }
}
