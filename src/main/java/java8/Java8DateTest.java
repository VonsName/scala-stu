package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ： fjl
 * @date ： 2019/3/29/029 8:38
 */
public class Java8DateTest {

    public static void main(String[] args) {


//        test1();
//        test2();
//        test3();
        test4();
    }

    /**
     * putIfAbsent 返回之前对应键的oldValue
     */
    private static void test4() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        Integer integer1 = map.putIfAbsent("1", 2);
        System.out.println("first put :" + integer1);
        Integer integer = map.putIfAbsent("1", 2);
        System.out.println("second put :" + integer);
    }


    private static void test3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime of = LocalDateTime.of(2015, Month.DECEMBER, 31, 13, 14, 55);
        System.out.println(of.format(formatter));
    }

    private static void test2() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minus = now.minus(2, ChronoUnit.DAYS);
        System.out.println(now.isAfter(minus));
    }

    private static void test1() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("DateTime:" + now);

        LocalDate now1 = LocalDate.now();
        System.out.println("Date:" + now1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println("beforePlus:" + format);

        LocalDateTime plus = now.plus(2, ChronoUnit.DAYS);
        System.out.println("afterPlus:" + plus.format(dateTimeFormatter));

        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now2 = LocalTime.now();
        String format1 = now2.format(timePattern);
        System.out.println("nowTime:" + format1);

        Month month = now.getMonth();
        System.out.println("month:" + month);
    }
}
