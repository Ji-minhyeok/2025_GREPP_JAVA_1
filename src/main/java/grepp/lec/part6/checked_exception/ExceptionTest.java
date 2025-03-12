package grepp.lec.part6.checked_exception;

public class ExceptionTest {

    public static void main(String[] args) {

        int result = test3();
        System.out.println("result = " + result);

        try {
            test1();
            test2();
        } catch ( Exception e ) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }

    }

    static int test3() {

        try {
            System.out.println("test3-try");
            active1();

            return 1;

        } catch ( RuntimeException e ) {
            System.out.println("test3-catch");
        } finally {
            System.out.println("test3-finally");
        }


        return 3;

    }

    static void test1() {
        active1();
        active2();
        active1();
    }

    static void active1() {
        throw new RuntimeException();
    }

    static void active2() throws RuntimeException {
        // thr
        throw new RuntimeException();
    }

    static void test2() throws Exception{
//        active3();
        active4();
    }

    static void active3() {
//        throw new Exception();
    }

    static void active4() throws Exception {
        throw new Exception();
    }

}
