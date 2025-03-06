package grepp.lec.part3.loop_statement;

public class LoopQuiz {

    public static void main(String[] args) {

        // Q3. 5 x 5 크기의 *로 구성된 직사각형을 출력해주세요
        // 예시)
        // *****
        // *****
        // *****
        // *****
        // *****

        for ( int i = 0; i <5; i++ ) {
            for ( int j = 0; j <5; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
