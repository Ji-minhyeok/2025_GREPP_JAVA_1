package grepp.lec.part0;

public class StandardOutput {

    public static void main(String[] args) {

        System.out.println("Hello, World!"); // println()은 제일 마지막에 개행문자(newline)을 포함합니다.

        System.out.print("안녕하세요"); // print()는 내용을 출력하지만 개행문자를 포함하지 않습니다.
        System.out.print("\n"); // 개행이 필요하다면 직접 입력해야 합니다.
        System.out.print("반갑습니다!\n");

        System.out.printf("%d 는 숫자입니다!\n", 100); // printf()는 형식 문자열(Formatting)을 할 때 사용합니다, 개행문자는 포함하지 않습니다.
        System.out.printf("안녕하세요, %s 님!\n", "고객");

    }

}
