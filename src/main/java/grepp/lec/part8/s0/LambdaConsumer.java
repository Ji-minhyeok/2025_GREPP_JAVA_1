package grepp.lec.part8.s0;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test3() {

        List<String> jap = Arrays.asList("마키", "유키", "마리카");

//        Consumer<String> sayHello = s -> {
//            System.out.println("Hello, " + s);
//            System.out.println("반가워!");
//        };

        Consumer<String> lv1 = s -> System.out.println("Hello, " + s);
        Consumer<String> lv2 = lv1.andThen(s -> System.out.println("반가워!" + s));

        for (String friend : jap) {
//            lv1.accept(friend);
            lv2.accept(friend);
        }

    }

    private static void test2() {

        List<String> chineseFriends = Arrays.asList("장곤", "팽흠", "청청", "소미");

//        sayHello(chineseFriends, new Hello<String>() {
//            @Override
//            public void accept(String value) {
//                System.out.println(value);
//            }
//        });

        sayHello(chineseFriends, s -> System.out.println(s));

    }

    static void sayHello(List<String> list, Hello<String> hello) {
        for (String s : list) {
            hello.accept(s);
        }
    }


    private static void test1() {

        // Consumer
        Consumer<String> consumer1 = new Consumer<>() {
            @Override
            public void accept(String o) {
                System.out.println("o = " + o);
            }
        };

        consumer1.accept("Hello!");

        Consumer<String> consumer2 = (s) -> {
            System.out.println("s = " + s);
        };

        consumer2.accept("장곤");

        Consumer<String> consumer3 = (s) -> System.out.println("s = " + s);
        consumer3.accept("팽흠!");

        Consumer<String> consumer4 = s -> System.out.println("s = " + s);
        consumer4.accept("마키");

    }

    interface Hello<T> {
        void accept(T value);
    }


}
