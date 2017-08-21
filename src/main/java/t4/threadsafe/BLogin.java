package t4.threadsafe;

/**
 * Created by lszhen on 2017/8/20.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","BB");
    }
}
