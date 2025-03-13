package grepp.lec.part7.s3.box;

import grepp.lec.part7.s3.tools.Installable;
import grepp.lec.part7.s3.tools.Portable;
import grepp.lec.part7.s3.tools.Tool;

public class PortableToolBox<T extends Tool & Portable> extends Box<T> {

    public PortableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content = " + content.getName());
        content.portable();
    }

}
