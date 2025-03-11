package grepp.lec.part5.inner_class.static_class;

public class StaticInnerClassMemoryLeakTest {

    static class StaticInnerClass {
        void display() {
            System.out.println("Display from StaticInnerClass");
        }
    }

    // 메모리에서 자동 해제
    public static void main(String[] args) {
        StaticInnerClass inner = new StaticInnerClass();
//        inner.display(); // "Display from StaticInnerClass" 출력
//        inner = null;
//        inner.display();

        StaticInnerClass inner2 = new StaticInnerClass();
        inner2.display();

        inner2 = null;
        inner2.display();

    }

}
