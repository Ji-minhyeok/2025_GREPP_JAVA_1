package grepp.lec.part5.abstract_class.s1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s가 개껌을 먹습니다!\n", name);
    }

    @Override
    public void sleep() {
        System.out.printf("%s가 코를 골면서 낮잠을 잡니다!\n", name);
    }

    @Override
    public void run(int speed) {
        System.out.printf("%s이/가 %d km/h의 속도로 달립니다!\n", name, speed);
    }

    @Override
    public void hide(String place) {
        System.out.printf("%s가 %s에 숨었습니다!", name, place);
    }
}
