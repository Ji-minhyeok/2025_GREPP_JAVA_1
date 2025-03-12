package grepp.lec.part7.s1;

public class BoxTests {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {

        try {
            Optional.of(null);
        } catch ( NullPointerException e ) {
            System.out.println("Null은 보관할 수 없습니다!");
            System.out.println(e.getMessage());
        }

        Optional<Object> empty = Optional.empty();

        boolean isEmpty = empty.isEmpty();
        boolean isPresent = empty.isPresent();

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

        try {
            empty.get();
        } catch ( NoSuchElementException e ) {
            System.out.println(e.getMessage());
        }


    }

    private static void test1() {

//        new Box<String>();

        String rawString = "안녕하세요!";

        Optional<String> stringOptional = Optional.of(rawString);

        boolean isEmpty = stringOptional.isEmpty();
        boolean isPresent = stringOptional.isPresent();

        boolean result = rawString.equals(stringOptional.get());
        System.out.println("result = " + result);

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

    }

}
