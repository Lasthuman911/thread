package t4.threadsafe;

/**
 * Created by lszhen on 2017/8/20.
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
