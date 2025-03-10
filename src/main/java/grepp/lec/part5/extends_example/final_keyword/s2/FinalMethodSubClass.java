package grepp.lec.part5.extends_example.final_keyword.s2;

import grepp.lec.part5.extends_example.final_keyword.s2.inner.FinalMethod;

public class FinalMethodSubClass extends FinalMethod {

//    public void method1() {
//
//    }

    public void method3(final int a, final int b) {

        int sum = a + b;
        System.out.println("sum = " + sum);

    }

}
