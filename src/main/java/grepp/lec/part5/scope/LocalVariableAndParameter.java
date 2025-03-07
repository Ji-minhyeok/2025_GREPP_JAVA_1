package grepp.lec.part5.scope;

public class LocalVariableAndParameter {

    public void method1(){

        int x = 10;

        System.out.println(x);

    }

    public void method2(int y){

        int x = 10;

        System.out.println(x + y);

    }

    public void method3(){
//        System.out.println(y); // 컴파일 오류
    }

}
