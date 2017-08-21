package t4.threadsafe;

/**
 * Created by lszhen on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
