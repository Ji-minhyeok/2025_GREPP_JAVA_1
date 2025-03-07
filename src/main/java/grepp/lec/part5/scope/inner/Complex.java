package grepp.lec.part5.scope.inner;

public class Complex {

    public int a = 10;

    public void someMethod() {
        if ( true ) {
            a = 20;
        }
    }

}
