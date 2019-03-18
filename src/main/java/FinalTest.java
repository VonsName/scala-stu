/**
 * @author ： fjl
 * @date ： 2019/3/18/018 9:43
 */
public class FinalTest {

    static class User {
        private final Book book = new Book();

        @Override
        public String toString() {
            return "User{" +
                    "book=" + book +
                    '}';
        }
    }

    private static class Book {
        String name;
    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1);
        User user2 = new User();
        System.out.println(user2);
    }
}
