package grepp.lec.part7.s3.tools.portable;

import grepp.lec.part7.s3.tools.Portable;
import grepp.lec.part7.s3.tools.Tool;

public class HandGrinder extends Tool implements Portable {

    private final String NAME = "HAND_GRINDER";

    @Override
    public void portable() {
        System.out.println("Portable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
