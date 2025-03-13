package grepp.lec.part7.s3.box;

import grepp.lec.part7.s3.tools.Installable;
import grepp.lec.part7.s3.tools.Tool;

public class InstallableToolBox<T extends Tool & Installable> extends Box<T> {

    public InstallableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content = " + content.getName());
        content.installable();
    }

}
