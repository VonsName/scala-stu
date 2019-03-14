/**
 * @author ： fjl
 * @date ： 2019/3/14/014 11:29
 */
public class ThreadTest {

    public static void main(String[] args) {
        new Thread(new ThreadEx(), "偶数").start();
        new Thread(new ThreadEx(), "奇数").start();
    }
}
