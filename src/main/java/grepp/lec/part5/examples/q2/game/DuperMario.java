package grepp.lec.part5.examples.q2.game;

public class DuperMario {

    private String name = "듀퍼마리오";

    public String getName() {
        return name;
    }

    // 실행 종료
    public void launch() {
        System.out.println(name + " 을 실행했습니다!");
    }

    public void exit() {
        System.out.println(name + " 을 종료했습니다!");
    }

}
