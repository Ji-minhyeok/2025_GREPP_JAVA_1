package grepp.lec.part5.inner_class;

public class InstanceOuterClassTest {

    public static void main(String[] args) {
        InstanceOuterClass.InnerClass innerClass2 = new InstanceOuterClass().new InnerClass();
        innerClass2.printOuterMemberVariables();
    }

}
