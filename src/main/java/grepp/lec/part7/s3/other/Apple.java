package grepp.lec.part7.s3.other;

import grepp.lec.part7.s3.tools.Portable;

public class Apple implements Portable {

    private final String taste = "달다";

    @Override
    public void portable() {
        System.out.println("저는 갖고 다닐수는 있어요!");
    }

}
