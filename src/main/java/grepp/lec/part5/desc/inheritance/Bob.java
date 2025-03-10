package grepp.lec.part5.desc.inheritance;

public class Bob extends Person {

    public boolean isHandsome;

    public Bob(String name, int age, int height, boolean isHandsome) {
        super(name, age, height);
        this.isHandsome = isHandsome;
    }

}
