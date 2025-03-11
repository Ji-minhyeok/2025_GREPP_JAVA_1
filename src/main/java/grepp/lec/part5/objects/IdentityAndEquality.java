package grepp.lec.part5.objects;

import grepp.lec.part5.objects.inner.MemberV1;
import grepp.lec.part5.objects.inner.MemberV2;
import grepp.lec.part5.objects.inner.MemberV3;

public class IdentityAndEquality {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
        test6();
    }

    private static void test6() {

        MemberV3 member1 = new MemberV3(1, "John", "admin@example.com");
        MemberV3 member2 = new MemberV3(2, "John", "other@example.com");
        MemberV3 member3 = new MemberV3(3, "Tom", "admin@example.com");


        boolean result1 = member1.equals(member2);
        boolean result2 = member1.equals(member3);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }

    // Objects
    static void test5() {

        Class<MemberV2> memberV2Class = MemberV2.class;
        System.out.println("memberV2Class = " + memberV2Class);


        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        System.out.println("member1.getClass() == member2.getClass() = " + (member1.getClass() == member2.getClass()));


    }


    private static void test4() {

        MemberV2 member1 = new MemberV2(1, "John", "admin@example.com");
        MemberV2 member2 = new MemberV2(1, "John", "admin@example.com");

        System.out.println("member1.equals(member2) = " + member1.equals(member2)); // true


    }

    private static void test3() {

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

//        boolean result = member1.equals(member2);
        System.out.println("member1.equals(member2) = " + member1.equals(member2)); // false

    }

    private static void test2() {

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        boolean result1 = member1 == member2; // 동일성(Identity)

        System.out.println("result1 = " + result1);

        MemberV1 member3 = member1;

        boolean result2 = member3 == member1;
        System.out.println("result2 = " + result2);

    }

    private static void test1() {
        System.out.println("ObjectCompareTests.test1");

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        int member1_id = member1.getMemberId();
        int member2_id = member2.getMemberId();

        boolean result1 = member1_id == member2_id;

        System.out.println("result = " + result1); // true

//        String name1 = member1.getName();
//        String name2 = new String("John");

//        boolean result2 = name1 == name2;

//        System.out.println("result2 = " + result2);


        System.out.println("ObjectCompareTests.test1");


    }

}
