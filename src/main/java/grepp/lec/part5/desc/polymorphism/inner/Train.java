package grepp.lec.part5.desc.polymorphism.inner;

public class Train extends Vehicle {

    @Override
    public void drive(int distance) {
        System.out.printf("%d 만큼 기찻길로 달립니다!\n", distance);
    }

}
