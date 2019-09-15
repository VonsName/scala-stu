import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/8/23 20:21
 */
public class RocketmqConsumer {
    public static void main(String[] args) throws MQClientException {

        DefaultMQPushConsumer pushConsumer = new DefaultMQPushConsumer();
        pushConsumer.setNamesrvAddr("117.78.5.14:9876");
        pushConsumer.subscribe("OrderTopic", "OrderTag");
        pushConsumer.setConsumerGroup("order-rocket");
        pushConsumer.setVipChannelEnabled(false);
        pushConsumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                for (MessageExt messageExt : list) {
                    System.out.println("消费端接收消息：" + new String(messageExt.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        pushConsumer.start();
    }
}
