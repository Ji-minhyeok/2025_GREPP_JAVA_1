package grepp.lec.part7.s3.component;

import grepp.lec.part7.s3.box.Box;
import grepp.lec.part7.s3.tools.Installable;
import grepp.lec.part7.s3.tools.Portable;

public class Packager<T> {

    public static void closePortableBox(Box<? extends Portable> box) {
        box.close();
    }

    public static void closeInstallableBox(Box<? extends Installable> box) {
        box.close();
    }

    public static void closeBox(Box<?> box) {
        box.close();
    }

    public void close(Box<T> box) {
        box.close();
    }


}
