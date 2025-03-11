package grepp.lec.part5.inner_class.independent_class;

public class IndependentClass {

    private final String name = "PublicClass";

    public void printName() {
        System.out.println("name = " + name);
    }

    public void printOuterDefaultClassName() {
//        OuterDefaultClass.name;

        OuterDefaultClass outerCls = new OuterDefaultClass();

        int sharedIntegerValue = outerCls.sharedIntegerValue;
        System.out.println("sharedIntegerValue = " + sharedIntegerValue);

        outerCls.printName();

    }

}

class OuterDefaultClass {

    private final String name = "OuterDefaultClass";
    public final int sharedIntegerValue = 100;

    public void printName() {
        System.out.println("name = " + name);
    }

}
