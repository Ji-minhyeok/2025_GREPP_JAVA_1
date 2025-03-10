package grepp.lec.part5.abstract_class.s0;

import grepp.lec.part5.abstract_class.s0.inner.CalaxyS25;
import grepp.lec.part5.abstract_class.s0.inner.JPhone;
import grepp.lec.part5.abstract_class.s0.inner.SmartPhone;

public class SmartPhoneStore {

    public static void main(String[] args) {
//        customer1();
//        customer2();
        customer3();
    }

    private static void customer3() {

        JPhone jPhone1 = generateJPhone();
        JPhone jPhone2 = generateJPhone();

        CalaxyS25 calaxyS25 = generateCalaxy();

        jPhone1.setTargetPhone(jPhone2);
        jPhone2.setTargetPhone(calaxyS25);

        jPhone1.call();
        jPhone1.msg();

        jPhone2.call();
        jPhone2.msg();

    }

    private static void customer2() {
        CalaxyS25 calaxyS25 = generateCalaxy();
        calaxyS25.msg();
        calaxyS25.call();
    }

    private static CalaxyS25 generateCalaxy() {
        return new CalaxyS25(true, 10, 10);
    }

    private static JPhone generateJPhone() {
        return new JPhone(true, 10, 10);
    }

    private static void customer1() {

        SmartPhone smartPhone = new SmartPhone(true, 10, 10) {
            @Override
            public void call() {
                System.out.println("따르릉!");
            }

            @Override
            public void msg() {
                System.out.println("문자!");
            }
        };

        smartPhone.call();
        smartPhone.msg();

    }

}
