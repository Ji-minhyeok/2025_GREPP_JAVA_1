package grepp.lec.part5.extends_example.extends_keyword;

import grepp.lec.part5.extends_example.extends_keyword.inner.BaseClass;
import grepp.lec.part5.extends_example.extends_keyword.inner.SubClass;

public class ExtendClass {


    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        SubClass subClass = new SubClass("subClass", "childClass");
        subClass.introduce(); // ?
        subClass.getUniqueName(); // ?
    }

}
