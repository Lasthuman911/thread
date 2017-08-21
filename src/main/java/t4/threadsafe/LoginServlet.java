package t4.threadsafe;

/**
 * Created by lszhen on 2017/8/20.
 */
public class LoginServlet {
    private static String userNameRef;
    private static String passwordRef;

    //加入关键字：排队进入方法
    synchronized public static void doPost(String userName, String password) {
        try {
            userNameRef = userName;
            if (userName.equals("a")) {
                Thread.sleep(5000);

            }
            passwordRef = password;
            System.out.println("userName=" + userNameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
