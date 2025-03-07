package grepp.lec.part5.scope;

public class LocalVariable {

    public void method1(){

        int x = 10;

        System.out.println(x);

    }

    public void method2(){
//        System.out.println(x); // 컴파일 오류
    }


}
