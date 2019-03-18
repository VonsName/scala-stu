import java.lang.reflect.Method;

/**
 * @author ： fjl
 * @date ： 2019/3/18/018 13:43
 */
public class UserServiceImpl implements IUserService,IBookService{
    @Override
    public void addUser() {

    }

    @Override
    public void queryUser() {

    }

    @Override
    public void addBook() {

    }

    public void addU(String name){}

    public static void main(String[] args) throws NoSuchMethodException {
//        Class<?>[] interfaces = UserServiceImpl.class.getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getName());
//            Method[] methods = anInterface.getMethods();
//            Method addUser = anInterface.getMethod("addUser");
//            System.out.println(addUser);
////            for (Method method : methods) {
////                System.out.println(method);
////            }
//        }
        Method addBook = UserServiceImpl.class.getMethod("addU",String.class);
        Class<?>[] parameterTypes = addBook.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        System.out.println(addBook);

    }
}
