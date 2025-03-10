package grepp.lec.part5.independent_class;

public class IndependentClass {

    private final String name = "IndependentClass";

    public void printName() {
        System.out.println("name = " + name);
    }

    public void printOuterDefaultClassName() {

        OuterDefaultClass outerCls = new OuterDefaultClass();
        outerCls.printName();

        int sharedIntegerValue = outerCls.sharedIntegerValue;
        System.out.println("sharedIntegerValue = " + sharedIntegerValue);

        printName();

    }

}

class OuterDefaultClass {

    private final String name = "OuterDefaultClass";
    public final int sharedIntegerValue = 100;

    public void printName() {
        System.out.println("name = " + name);
    }

}
