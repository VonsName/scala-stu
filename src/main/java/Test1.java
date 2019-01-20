public class Test1 {

    private void m1(String s) {
        System.out.println(s + "Test1--m1");
    }

    public void m2(String s) {
        System.out.println(s + "Test1--m2");
        m1(s);
    }
}

class Test2 extends Test1 {
    public void m1(String s) {
        System.out.println(s + "Test2 m1");
        m2(s);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.m1("aa");
        boolean a = false;
        boolean b = false;
        System.out.println(a && b);

        int[] arr=new int[5];
        int[] arr1;
        arr1=new int[6];
    }
}
