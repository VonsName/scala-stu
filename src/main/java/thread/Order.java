package thread;

/**
 * @author ： fjl
 * @date ： 2019/3/21/021 16:54
 */
public class Order implements Comparable {

    private int failCount;

    private String orderNo;

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public int compareTo(Object o) {
        int pro = 0;
        if (o instanceof Order) {
            Order order = (Order) o;
            if (this.getFailCount() > order.getFailCount()) {
                pro = 1;
            } else if (this.getFailCount() == order.getFailCount()) {
                pro = 0;
            } else if (this.getFailCount() < order.getFailCount()) {
                pro = -1;
            }
        }
        return pro;
    }

    @Override
    public String toString() {
        return "Order{" +
                "failCount=" + failCount +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
