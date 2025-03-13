package grepp.lec.part7.s3.tools.portable;

import grepp.lec.part7.s3.tools.Installable;
import grepp.lec.part7.s3.tools.Portable;
import grepp.lec.part7.s3.tools.Tool;

public class HugeCrowbar extends Tool implements Installable {

    private final String NAME = "VERY_HUGE_CROWBAR";

    @Override
    public void installable() {
        System.out.println("installable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
