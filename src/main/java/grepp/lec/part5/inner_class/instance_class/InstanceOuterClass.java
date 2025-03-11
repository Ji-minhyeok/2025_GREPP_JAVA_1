package grepp.lec.part5.inner_class.instance_class;

// Outer Class
public class InstanceOuterClass {

    private final String name = "InstOuterClass";
    protected final String protectedValue = "protectedValue";
    public final Integer sharedValue = 100;
    String defaultValue = "defaultValue";

    private final String duplicatedName = "duplicatedName1";

    // Inner Class
    // 인스턴스 클래스
    class InnerClass {

        public static final String constValue = "CONST";
        public final Integer sharedValue = 90;
        private final String duplicatedName = "duplicatedName2";

        public void printOuterMemberVariables() {
            System.out.println("name = " + name);
            System.out.println("protectedValue = " + protectedValue);
            System.out.println("sharedValue = " + sharedValue);
            System.out.println("defaultValue = " + defaultValue);
        }

        public void printDuplicatedValue() {

            String outerValue = InstanceOuterClass.this.duplicatedName;
            String innerVariable = this.duplicatedName;

            System.out.println("outerValue = " + outerValue);
            System.out.println("innerVariable = " + innerVariable);

        }

    }

    public void printInnerClassVariables() {

        System.out.println("InnerClass.constValue = " + InnerClass.constValue);

        InnerClass innerClass = new InnerClass();

        String innerStringValue = innerClass.duplicatedName;
        System.out.println("innerStringValue = " + innerStringValue);
        System.out.println("innerClass.sharedValue = " + innerClass.sharedValue);

    }

}
