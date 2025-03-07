package grepp.lec.part5.examples.q1;

public class Sword {

    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println(name + "을/를 휘둘렀습니다.");
    }

}
