package t1.startsunxu;

import java.lang.*;

/**
 * Created by lszhen on 2017/8/20.
 */
public class MyThread extends java.lang.Thread {
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }
    @Override
    public void run() {
      System.out.println(i);
    }
}
