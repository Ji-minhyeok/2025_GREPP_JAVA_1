package grepp.lec.part2.operator;

public class ConditionalOperator {

    public static void main(String[] args) {
        /*
        int a = true // 논리 자료형 값 또는 식
                ? 10 // 조건절이 참일때 값
                : 5; // 조건절이 거짓일때 값
        */

        boolean isFinishWork = true;
        String canIGoHome = isFinishWork
                ? "yes"
                : "no";
        System.out.println("canIGoHome = " + canIGoHome);

//        int remainedWork = 10;
        int remainedWork = 9;
        String couldIGoHome = remainedWork < 10
                ? "Yes"
                : "No";
        System.out.println("couldIGoHome = " + couldIGoHome);


    }


}
