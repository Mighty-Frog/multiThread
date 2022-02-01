package createMultiThread;

import java.util.concurrent.Callable;

public class TestCallable {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable("BIG BANG");
        //String call = null;
        try {
            System.out.println(myCallable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {
    private String info;
    public MyCallable(String arg) {
        this.info = arg;
    }
    @Override
    public String call() throws Exception {
        return info;
    }
}
