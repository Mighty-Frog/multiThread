package startAndRunDiffer;

import org.junit.Test;

/**
 * The type Illegal component state exception.
 */
public class IllegalComponentStateException {

    /**
     * Test 1.
     * one thread object can only invoke start() method once
     * or it will throw IllegalComponentStateException
     */
    @Test
    public void test1() {
        MyThread myThread = new MyThread();
        int i = 0;
        for (;;) {
            if (i == 3) {
                break;
            }
            myThread.start();
            i++;
        }
    }

    /**
     * Test 2.
     * if we modify code with creating new Thread object every time, it will not get Exception
     */
    @Test
    public void test2() {
        int i = 0;
        for (;;) {
            if (i == 3) {
                break;
            }
            MyThread myThread = new MyThread();
            myThread.start();
            i++;
        }
    }

    /**
     * Test 3.
     * one thread could invoke run() method many times
     */
    @Test
    public void test3() {
        MyThread myThread = new MyThread();
        for (int i = 0; i < 3; i++) {
            myThread.run();
        }

    }


}

/**
 * The type My thread.
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is my Thread" + Thread.currentThread().getName());
    }
}
