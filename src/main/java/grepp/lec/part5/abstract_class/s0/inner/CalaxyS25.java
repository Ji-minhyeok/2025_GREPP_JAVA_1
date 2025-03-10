package grepp.lec.part5.abstract_class.s0.inner;

public class CalaxyS25 extends SmartPhone {

    private int recordCount = 0;

    public CalaxyS25(boolean power, int sound, int lightLevel) {
        super(power, sound, lightLevel);
    }

    @Override
    public void call() {
        if ( this.power ) {
            System.out.println("통화를 합니다.");
            recordCount++;
        }
    }

    @Override
    public void msg() {
        if ( this.power ) {
            System.out.println("문자를 합니다.");
        }
    }

}
