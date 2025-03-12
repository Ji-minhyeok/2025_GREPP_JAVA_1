package grepp.lec.part7.s0;

import grepp.lec.part7.s0.inner.MyGeneric;

public class MyGenericTests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {

        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("test4");

    }

    private static void test3() {

        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

    }

    private static void test2() {

        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("key");
        generic.setValue(1);
        generic.setType(false);

    }

    private static void test1() {
//        MyGeneric<K, V, T>

        MyGeneric<String, String, String> generic = new MyGeneric<>();

        generic.setKey("key");
        generic.setValue("value");
        generic.setType("type");
//        generic.setType(1);

        System.out.println("generic = " + generic);


    }

}
