package createMultiThread;

public class testWithPara {

    public static void main(String[] args) {

        MyRunnablePara myTread = new MyRunnablePara(12);
        myTread.start();
    }
}

class MyRunnablePara extends Thread {
    private int age;

    public MyRunnablePara(int arg) {
        this.age = arg;
    }

    @Override
    public void run() {
        System.out.println(
                age + " " + Thread.currentThread().getName()
        );
    }
}
