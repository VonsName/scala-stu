package thread;

import java.util.concurrent.TimeUnit;

/**
 * @author ： fjl
 * @date ： 2019/3/29/029 11:12
 */
public class ThreadJoinTest {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        CookieShopingJoin cookieShopingJoin = new CookieShopingJoin();
        Thread thread = new Thread(cookieShopingJoin);
        thread.start();
        thread.join();
        System.out.println("厨具到达。。 开始做菜");
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
            System.out.println("超时买蔬菜");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("蔬菜买到");
        long endTime = System.currentTimeMillis();
        System.out.println("总过耗时：" + (endTime - start));
    }
}
