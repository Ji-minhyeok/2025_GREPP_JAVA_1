package grepp.lec.part5.extends_example.final_keyword.s2;

import grepp.lec.part5.extends_example.final_keyword.s2.inner.FinalMethodParameter;

public class FinalMethodParameterImpl implements FinalMethodParameter {
    @Override
    public void method1() {

    }

    @Override
    public void method2(int a, int b) {

    }

    @Override
    public void method3(int a, int b) {
        a = 20;
        b = 30;
        System.out.println("a = " + a + ", b = " + b);
    }

    @Override
    public void method4(final int a, final int b) {

    }
}
