package t3;

/**
 * 线程不共享变量的情况
 * Created by lszhen on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        Thread a = new MyThread("A");
        Thread b = new MyThread("B");
        Thread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
