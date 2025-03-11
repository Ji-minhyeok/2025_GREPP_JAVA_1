package grepp.lec.part5.inner_class.static_class;

public class StaticOuterClass {

    private final String instanceName = "StaticOuterClassInstanceName";
    private static final String staticName = "StaticOuterClassStaticName";

    public final Integer sharedInstanceValue = 100;
    public static final Integer sharedStaticValue = 90;

    static class StaticInnerClass {

        private String innerName = "StaticInnerClassInstanceName";
        private static String innerPrivateStaticName = "StaticInnerClassInstanceName";

        public Integer innerValue = 100;
        public static Integer innerPublicStaticValue = 90;

        public static int a = 10;
        public int b = 20;

        public void test() {

            System.out.println("staticName = " + staticName);

            System.out.println("sharedStaticValue = " + sharedStaticValue);

            StaticOuterClass staticOuterClass = new StaticOuterClass();
            String instanceName1 = staticOuterClass.instanceName;
            System.out.println("instanceName1 = " + instanceName1);

        }

    }

    public void accessToInnerClass() {

        String staticInnerStaticName = StaticInnerClass.innerPrivateStaticName;
        Integer innerPublicStaticValue = StaticInnerClass.innerPublicStaticValue;

        System.out.println("innerPublicStaticValue = " + innerPublicStaticValue);
        System.out.println("innerPublicStaticValue = " + innerPublicStaticValue);

        StaticInnerClass staticInnerClass = new StaticInnerClass();

        String innerName = staticInnerClass.innerName;
        Integer innerValue = staticInnerClass.innerValue;
        System.out.println("innerName = " + innerName);
        System.out.println("innerValue = " + innerValue);

    }


}
