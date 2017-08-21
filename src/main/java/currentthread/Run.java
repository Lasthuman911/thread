package currentthread;

/**
 * Created by lszhen on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        CurrentOperate currentOperate = new CurrentOperate();
        Thread t1 = new Thread(currentOperate);
       // t1.setName("A");
        t1.start();
    }
}
