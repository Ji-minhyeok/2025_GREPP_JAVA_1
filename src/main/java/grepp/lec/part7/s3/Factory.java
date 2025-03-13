package grepp.lec.part7.s3;

import grepp.lec.part7.s3.box.*;
import grepp.lec.part7.s3.other.Apple;
import grepp.lec.part7.s3.tools.portable.Hammer;
import grepp.lec.part7.s3.tools.portable.HandGrinder;
import grepp.lec.part7.s3.tools.portable.HugeCrowbar;
import grepp.lec.part7.s3.tools.portable.HugeGrinder;

public class Factory {

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test3() {

        HandGrinder handGrinder = new HandGrinder();
        PortableToolBox<HandGrinder> toolBox1 = new PortableToolBox<>(handGrinder);
        toolBox1.open();

//        HugeCrowbar hugeCrowbar = new HugeCrowbar();
//        new PortableToolBox<HugeCrowbar>();

        HugeCrowbar hugeCrowbar = new HugeCrowbar();
        InstallableToolBox<HugeCrowbar> toolbox2 = new InstallableToolBox<>(hugeCrowbar);
        toolbox2.open();

    }

    private static void test2() {

        Hammer hammer = new Hammer();
        ToolBox<Hammer> hammerBox = new ToolBox<>(hammer);
        hammerBox.open();

//        Apple apple = new Apple();
//        new ToolBox<Apple>(apple);

        HugeGrinder hugeGrinder = new HugeGrinder();
        ToolBox<HugeGrinder> hugeGrinderToolBox = new ToolBox<>(hugeGrinder);
        hugeGrinderToolBox.open();


    }

    private static void test1() {

        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>(apple);
        appleBox.open();

        HugeGrinder hugeGrinder = new HugeGrinder();
        Box<HugeGrinder> hugeGrinderBox = new Box<>(hugeGrinder);
        hugeGrinderBox.open();

    }

}
