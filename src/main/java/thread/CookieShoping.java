package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author ： fjl
 * @date ： 2019/3/29/029 10:42
 */
public class CookieShoping implements Callable<Cookie> {


    @Override
    public Cookie call() throws Exception {
        System.out.println("下单");
        System.out.println("等待送达");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("送货到达");
        Cookie cookie = new Cookie();
        return cookie;
    }
}
