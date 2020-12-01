

public class Test2 {
    public static void main(String[] args) {
        long currentTime = System.nanoTime();
        test1();
        test2();
        System.out.println(System.nanoTime() - currentTime);
    }

    private static void test1() {
        ThreadTest tt = new ThreadTest();
        tt.run();
    }

    private static void test2() {
        System.out.println("zzz");
    }
}

class ThreadTest implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("z");
            Thread.sleep(1000);
            System.out.println("zz");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
