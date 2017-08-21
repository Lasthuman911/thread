package currentthread;

/**
 * Created by lszhen on 2017/8/20.
 */
public class CurrentOperate extends Thread {
    public CurrentOperate() {
        System.out.println("currentOpe----begin");
        System.out.println("currentThread.getname===" + Thread.currentThread().getName());
        System.out.println("this.getName=" + this.getName());
        System.out.println("currentOpe-end");
    }

    @Override
    public void run() {
        System.out.println("run----begin");
        System.out.println("currentThread.getname===" + Thread.currentThread().getName());
        System.out.println("this.getName=" + this
                .getName());
        System.out.println("run-end");
    }
}
