package grepp.lec.part2.operator;

public class BitwiseOperator {

    public static void main(String[] args) {

        int a = 0b0101; // 5
        int b = 0b0011; // 3

        int result = a & b;
        System.out.println("result = " + result);

        int c = 0b0101; // 5
        int d = 0b0011; // 3

        result = c | d; // 0111;
        System.out.println("result = " + result);

        int e = 0b0101; // 5
        int f = 0b0011; // 3
        result = e ^ f; // 0110
        System.out.println("result = " + result);

        int g = 0b0101;
        result = ~g;
        System.out.println("result = " + result);

        int h = 0b0101;
        //      0b1010;
        result = h << 1;
        System.out.println("result = " + result); // 10

        int i = 0b0101;
        //      0b0010;
        result = i >> 1;
        System.out.println("result = " + result); // 2

        int j = -20; // 1111 1111 1111 1111 1111 1111 1110 1100
        result = j >>> 2; // 0011 1111 1111 1111 1111 1111 1011
        System.out.println("result = " + result); // 1073741819


    }

}
