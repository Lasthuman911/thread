/**
 * Created by lszhen on 2017/8/20.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+"MyThread");
    }
}
