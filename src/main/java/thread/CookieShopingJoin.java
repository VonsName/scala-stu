package thread;

import java.util.concurrent.TimeUnit;

/**
 * @author ： fjl
 * @date ： 2019/3/29/029 11:11
 */
public class CookieShopingJoin implements Runnable {

    private Cookie cookie;

    @Override
    public void run() {

        System.out.println("下单");
        System.out.println("等待送达");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("送货到达");
        cookie = new Cookie();
    }

    public Cookie get() {
        return cookie;
    }
}
