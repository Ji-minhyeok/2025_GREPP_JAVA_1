package grepp.lec.part2.operator;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int pmA = 10, pmB = 5;
//        int sumResult = pmA + pmB;

        // cmd + option + v // mac
        // ctl + alt + v // windows
        int sumResult = pmA + pmB;
        System.out.println("sumResult = " + sumResult);

        String hello = "Hello ";
        String world = "World!";
        String sumString = hello + world;
        System.out.println("sumString = " + sumString);

        int minusResult = pmA - pmB;
        System.out.println("minusResult = " + minusResult);

        int mdA = 10, mdB = 3;

        int multipleResult = mdA * mdB;
        System.out.println("multipleResult = " + multipleResult);

        int divideResult = mdA / mdB;
        System.out.println("divideResult = " + divideResult);

        double doubleA = 10., doubleB = 3.;
        double doubleDivideResult = doubleA / doubleB;
        System.out.println("doubleDivideResult = " + doubleDivideResult);

        int remainResult = mdA % mdB;
        System.out.println("remainResult = " + remainResult);

        // 증감 연산자
        int preIncA = 5;
        ++preIncA;
        System.out.println("preIncA = " + preIncA);

        int postIncA = 5;
        postIncA++;
        System.out.println("postIncA = " + postIncA);

        int q1 = 5;
        System.out.println("q1 = " + ++q1 * 3); // 18
        System.out.println("q1 = " + q1);

        q1 = 5;
        System.out.println("q1 = " + q1++ * 3); // 15
        System.out.println("q1 = " + q1);

        int preDecA = 5;
        --preDecA;
        System.out.println("preDecA = " + preDecA);

        int postDecB = 5;
        --postDecB;
        System.out.println("preDecA = " + postDecB);

        int q2 = 5;
        System.out.println("q2 = " + --q2 * 3); // 12
        System.out.println("q2 = " + q2);

        q2 = 5;
        System.out.println("q2 = " + q2-- * 3); // 15
        System.out.println("q2 = " + q2);


    }

}
