package samnum;

/**
 * println 方法在内部是同步的，但是i-- 操作是在进入println方法前执行的，由线程安全问题
 * Created by lszhen on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
