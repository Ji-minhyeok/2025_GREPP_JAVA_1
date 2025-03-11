package grepp.lec.part5.inner_class.independent_class.inner;

import grepp.lec.part5.independent_class.IndependentClass;

public class Section2_OtherPackageClass {

    public static void main(String[] args) {
//        new OuterDefaultClass();

        IndependentClass publicCls = new IndependentClass();

        publicCls.printOuterDefaultClassName();

    }

}
