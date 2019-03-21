package thread;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author ： fjl
 * @date ： 2019/3/21/021 16:54
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        Queue<Order> queue = new PriorityBlockingQueue<>(50);
        for (int i = 0; i < 50; i++) {
            Order order = new Order();
            order.setFailCount(new Random().nextInt(30));
            order.setOrderNo("order:" + i);
            queue.add(order);
        }
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }
}
