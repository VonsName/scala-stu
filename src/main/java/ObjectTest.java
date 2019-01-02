import scala.Char;

/**
 * @author ： fjl
 * @date ： 2018/12/28/028 10:16
 */
public class ObjectTest {
    public static void main(String[] args) {
        Integer integer = new Integer(2);

        char q = 'a';
        char c = 'a' + 1;
//        char c = q + 1; //compile error
        byte b = 2;
//        byte x = b + 2; //compile error
        System.out.println(c);
        char y = 97 + 1;
//        Char i = 97 + 1; //scala compile error
    }
}
