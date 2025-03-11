package grepp.lec.part5.inner_class.instance_class;

public class InstanceOuterClassMemoryLeakTest {

    private String name = "MemoryLeakTest";

    class InnerClass {
        void printName() {
            System.out.println(name);
            return;
        }
    }

    public static void main(String[] args) {
        InstanceOuterClassMemoryLeakTest instance = new InstanceOuterClassMemoryLeakTest();
        InnerClass innerClass = instance.new InnerClass();

        instance = null;
        innerClass.printName();

    }


}
