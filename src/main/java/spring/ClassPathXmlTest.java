package spring;

import annotation.MyComponent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author ： fjl
 * @date ： 2019/3/27/027 9:56
 */
public class ClassPathXmlTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Map<String, Object> beans = context.getBeansWithAnnotation(MyComponent.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println(beans);
    }
}
