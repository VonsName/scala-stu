package annotation;

import java.lang.annotation.*;

/**
 * @author ： fjl
 * @date ： 2019/3/21/021 13:37
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyComponent {
}
