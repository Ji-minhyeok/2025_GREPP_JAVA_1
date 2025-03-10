package grepp.lec.part5.desc.polymorphism;

import grepp.lec.part5.desc.polymorphism.inner.Airplane;
import grepp.lec.part5.desc.polymorphism.inner.Train;
import grepp.lec.part5.desc.polymorphism.inner.Vehicle;

public class PolymorphismTest {

    static int DISTANCE = 100;

    public static void main(String[] args) {

//        Airplane airplane = new Airplane();
//        airplane.drive(DISTANCE);

//        Train train = new Train();
//        train.drive(DISTANCE);
        go(new Train(), DISTANCE);
        go(new Airplane(), DISTANCE);

    }

    static void go(Vehicle vehicle, int DISTANCE) {
        vehicle.drive(DISTANCE);
    }

    // JPhone
    // CalaxyS25
    // SmartPhone


}
