package grepp.lec.part5.inner_class.static_class;

public class StaticInnerClassTest {

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {

        StaticOuterClass staticOuterClass = new StaticOuterClass();
        staticOuterClass.accessToInnerClass();

//        staticOuterClass.innerPrivateStaticName;

//        StaticOuterClass.new StaticInnerClass();

        StaticOuterClass.StaticInnerClass staticInnerClass1 = new StaticOuterClass.StaticInnerClass();
        StaticOuterClass.StaticInnerClass staticInnerClass2 = new StaticOuterClass.StaticInnerClass();

        System.out.println("staticInnerClass1 = " + (staticInnerClass1 == staticInnerClass2));
    }

    static void test2() {

        StaticOuterClass.StaticInnerClass staticInnerClass1 = new StaticOuterClass.StaticInnerClass();
        staticInnerClass1.b = 30;

        StaticOuterClass.StaticInnerClass staticInnerClass2 = new StaticOuterClass.StaticInnerClass();
        staticInnerClass2.b = 50;

        System.out.println("staticInnerClass1 = " + staticInnerClass1.b);
        System.out.println("staticInnerClass2 = " + staticInnerClass2.b);

    }

    static void test3() {

        StaticOuterClass.StaticInnerClass staticInnerClass1 = new StaticOuterClass.StaticInnerClass();
        StaticOuterClass.StaticInnerClass.a = 50;
        StaticOuterClass.StaticInnerClass staticInnerClass2 = new StaticOuterClass.StaticInnerClass();
        StaticOuterClass.StaticInnerClass.a = 0;

        System.out.println("staticInnerClass1 = " + staticInnerClass1.a);
        System.out.println("staticInnerClass2 = " + staticInnerClass2.a);

    }
}
