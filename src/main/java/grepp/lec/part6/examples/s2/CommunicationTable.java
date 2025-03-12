package grepp.lec.part6.examples.s2;

import grepp.lec.part6.examples.s2.inner.ForeignPeople;
import grepp.lec.part6.examples.s2.inner.LocalPeople;
import grepp.lec.part6.examples.s2.inner.People;

public class CommunicationTable {

    public static void main(String[] args) {
        scene1();
    }

    private static void scene1() {

        LocalPeople localPeople = new LocalPeople();
        ForeignPeople foreignPeople = new ForeignPeople();

        action(localPeople, foreignPeople);

    }

    static void action(People people1, People people2) {
        people1.communicate(people2, "안녕?");
    }

}
