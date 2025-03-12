package grepp.lec.part7.s0;

import grepp.lec.part7.s0.inner.MyStaticGeneric;

public class MyStaticGenericTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        MyStaticGeneric.test1("Hello");
        MyStaticGeneric.test3(100);
        MyStaticGeneric.test4(true);

        MyStaticGeneric myStaticGeneric = new MyStaticGeneric();
        myStaticGeneric.test2();


    }


}
