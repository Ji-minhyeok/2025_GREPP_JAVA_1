package grepp.lec.part5.scope;

import grepp.lec.part5.scope.inner.Complex;

public class ComplexScopeTests {

    public static int i = 15;

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    static void test1() {

        System.out.println("ComplexTests.test1");

        Complex complex2 = new Complex();
        System.out.println("other.a = " + complex2.a); // other.a = 10

        complex2.someMethod();
        System.out.println("other.a = " + complex2.a); // other.a = 20

    }

    static void test2() {

        System.out.println("ComplexTests.test2");

        Complex complex2 = new Complex();
        System.out.println("other.a = " + complex2.a);

        complex2.someMethod();
        System.out.println("other.a = " + complex2.a);

        for ( int i = 0; i < 10; i++ ) {
            System.out.println("i = " + i);
        }

    }

    static void test3() {
        System.out.println("ComplexTests.test3");

        Complex complex2 = new Complex();
        System.out.println("other.a = " + complex2.a);

        complex2.someMethod();
        System.out.println("other.a = " + complex2.a);

        int i = 20;

        // 컴파일 오류
//        for ( int i = 0; i < 10; i++ ) {
//            System.out.println("i = " + i);
//        }


    }

    static void test4() {
        System.out.println("ComplexTests.test4");

        Complex complex2 = new Complex();
        System.out.println("other.a = " + complex2.a);

        complex2.someMethod();
        System.out.println("other.a = " + complex2.a);

//        int i = 20;
        for ( i = 0; i < 10; i++ ) {
            System.out.println("i = " + i);
        }

        System.out.println("i = " + i);

    }

}
