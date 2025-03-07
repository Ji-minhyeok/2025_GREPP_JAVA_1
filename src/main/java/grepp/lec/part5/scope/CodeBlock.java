package grepp.lec.part5.scope;

public class CodeBlock {

    public int a = 10;


    public void someMethod() {

        if ( true ) {
            System.out.println("a = " + a);

            int b = 20;

            System.out.println("b = " + b);
        }

//        System.out.println("b = " + b); // 컴파일 오류

        {
            int c = 20;
        }

//        System.out.println("a = " + c); // 컴파일 오류


    }

}
