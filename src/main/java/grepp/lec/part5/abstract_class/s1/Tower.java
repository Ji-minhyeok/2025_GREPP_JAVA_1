package grepp.lec.part5.abstract_class.s1;

public class Tower {

    // Animal -> hide()
    private String place = "타워";

    public void service(Animal animal) {
        animal.hide(place);
    }

}
