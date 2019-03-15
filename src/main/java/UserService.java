import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author ： fjl
 * @date ： 2019/3/15/015 14:12
 */
public class UserService {

    public void addUser(String name,int id){}
    public void queryUser(String name){}

    public static void main(String[] args) {
        Method[] methods = UserService.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"----");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName()+"---name");
            }

            System.out.println(parameterTypes.length+"==----");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }
        }
    }
}
