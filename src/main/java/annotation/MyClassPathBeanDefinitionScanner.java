package annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.lang.annotation.Annotation;

/**
 * @author ： fjl
 * @date ： 2019/3/21/021 13:39
 */
public class MyClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    private Class<? extends Annotation> type;

    public MyClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry, Class<? extends Annotation> type) {
        super(registry);
        this.type = type;
    }

    public void registerTypeFilter() {
        addIncludeFilter(new AnnotationTypeFilter(type));
    }


    public static void main(String[] args) {
        String basePackage = "annotation";
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        MyClassPathBeanDefinitionScanner scanner = new MyClassPathBeanDefinitionScanner(applicationContext, MyComponent.class);
        scanner.registerTypeFilter();
        int scan = scanner.scan(basePackage);
        System.out.println(scan);
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
