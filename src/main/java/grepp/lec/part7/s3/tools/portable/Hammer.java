package grepp.lec.part7.s3.tools.portable;

import grepp.lec.part7.s3.tools.Portable;
import grepp.lec.part7.s3.tools.Tool;

public class Hammer extends Tool implements Portable {

    private final String NAME = "HAMMER";

    @Override
    public void portable() {
        System.out.println("portable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }

}
