package grepp.lec.part5.abstract_class.s1;

public class Garden {

    public static void main(String[] args) {

        Dog happy = new Dog("해피");
        happy.eat();
        happy.drink();
        happy.sleep();
        happy.run(20);
        happy.hide("동굴");

        Cat cat = new Cat("나비");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.run(20);
        cat.hide("동굴");

        cat.play("레이저 포인터");
        cat.sayAge();

        Tower tower = new Tower();

        tower.service(cat);
        tower.service(happy);

    }

}
