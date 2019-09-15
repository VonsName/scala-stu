import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/8/23 20:20
 */
public class RocketmqProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer();
        defaultMQProducer.setNamesrvAddr("117.78.5.14:9876");
        defaultMQProducer.setProducerGroup("order-rocket");
        defaultMQProducer.setVipChannelEnabled(false);
        defaultMQProducer.start();
        for (int i = 0; i < 50; i++) {
            Message message = new Message();
            message.setTopic("OrderTopic");
            message.setTags("OrderTag");
            message.setBody(("HELLO" + i).getBytes());
            defaultMQProducer.send(message);
            System.out.println("发送消息");
            Thread.sleep(1000);
        }
    }
}
