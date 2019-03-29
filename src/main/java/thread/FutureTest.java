package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author ： fjl
 * @date ： 2019/3/29/029 10:41
 */
public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();
        FutureTask<Cookie> task = new FutureTask<>(new CookieShoping());
        new Thread(task).start();
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
            System.out.println("超时买蔬菜");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("蔬菜买到");
        if (!task.isDone()) {
            System.out.println("厨具还没有送达。。请等待");
        }
        Cookie cookie = task.get();
        System.out.println("厨具到达。。 开始做菜");
        long endTime = System.currentTimeMillis();
        System.out.println("总过耗时：" + (endTime - start));
    }
}
