package grepp.lec.part8.s1;

public class Calculator {

    public static void main(String[] args) {

        PlusCalculator plusCalculator1 = new PlusCalculator() {
            @Override
            public Integer sum(int... values) {
                int result = 0;
                for (int value : values) {
                    result += value;
                }
                return result;
            }
        };

        Integer sum = plusCalculator1.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum = " + sum);

        PlusCalculator plusCalculator2 = (int... val) -> {
            int result = 0;
            for (int value : val) {
                result += value;
            }
            return result;
        };

        Integer sum1 = plusCalculator2.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum1 = " + sum1);


    }

    interface PlusCalculator {
        Integer sum(int... values);
    }

}
