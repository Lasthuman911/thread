/**
 * 线程调用的随机性
 * Created by lszhen on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName()+"运行结束！");
    }
}
