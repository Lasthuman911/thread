/**
 * 叫main的线程在执行main方法里面的代码
 * Created by lszhen on 2017/8/20.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//输出的main和方法名main无关系
    }
}
