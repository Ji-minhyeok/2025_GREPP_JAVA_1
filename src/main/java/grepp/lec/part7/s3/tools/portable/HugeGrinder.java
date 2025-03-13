package grepp.lec.part7.s3.tools.portable;

import grepp.lec.part7.s3.tools.Installable;
import grepp.lec.part7.s3.tools.Portable;
import grepp.lec.part7.s3.tools.Tool;

public class HugeGrinder extends Tool implements Installable, Portable {

    private final String NAME = "VERY_HUGE_GRINDER";

    @Override
    public void installable() {
        System.out.println("installable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public void portable() {
        System.out.println("portable");
    }

}
