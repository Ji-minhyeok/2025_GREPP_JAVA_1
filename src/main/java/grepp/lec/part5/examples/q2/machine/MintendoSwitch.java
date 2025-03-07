package grepp.lec.part5.examples.q2.machine;

import grepp.lec.part5.examples.q2.game.AnimalDross;
import grepp.lec.part5.examples.q2.game.DuperMario;
import grepp.lec.part5.examples.q2.game.Xelda;

public class MintendoSwitch {

    // 상태
    // 전원
    private boolean power = false;

    // 게임타이틀 3개
    private AnimalDross game1;
    private DuperMario game2;
    private Xelda game3;

    public void checkChip() {

        if (!power) {
            System.out.println("민텐도의 전원을 먼저 켜주시기 바랍니다!");
            return;
        }

        if ( game1 != null ) {
            System.out.println("현재 장착되어 있는 칩은 " +game1.getName() + "입니다!");
        } else if ( game2 != null ) {
            System.out.println("현재 장착되어 있는 칩은 " +game2.getName() + "입니다!");
        } else if ( game3 != null ) {
            System.out.println("현재 장착되어 있는 칩은 " +game3.getName() + "입니다!");
        } else {
            System.out.println("현재 칩이 장착되어있지 않습니다!");
        }


    }

    // 행동
    // 전원켜기
    public void powerOn() {

        if ( power ) {
            System.out.println("이미 전원이 켜져있습니다!");
            return;
        }

        power = true;
        System.out.println("민텐도 스위치의 전원을 켰습니다!");

    }

    // 전원 끄기
    public void powerOff() {

        if ( !power ) {
            System.out.println("이미 전원이 꺼져있습니다!");
            return;
        }

        power = false;
        System.out.println("민텐도 스위치의 전원을 껐습니다!");

    }

    // 칩 완전 제거
    public void initChip() {

        game1 = null;
        game2 = null;
        game3 = null;

        System.out.println("게임기에 장착된 칩을 제거했습니다!");

    }

    public void setChip(AnimalDross game1) {

        this.game1 = game1;
        game2 = null;
        game3 = null;

        System.out.println(game1.getName() + "을/를 장착했습니다!");

    }

    public void setChip(DuperMario game2) {

        game1 = null;
        this.game2 = game2;
        game3 = null;

        System.out.println(game2.getName() + "을/를 장착했습니다!");

    }

    public void setChip(Xelda game3) {

        game1 = null;
        game2 = null;
        this.game3 = game3;

        System.out.println(game3.getName() + "을/를 장착했습니다!");

    }


    // 게임 실행하기
    public void playGame() {

        if ( !power ) {
            System.out.println("민텐도의 전원을 먼저 켜주세요!");
            return;
        }

        if ( game1 != null ) {
            game1.launch();
        } else if ( game2 != null ) {
            game2.launch();
        } else if ( game3 != null ) {
            game3.launch();
        } else {
            System.out.println("현재 칩이 장착되어있지 않습니다!");
        }

    }

    // 게임 종료하기
    public void exitGame() {

        if ( !power ) {
            System.out.println("민텐도의 전원을 먼저 켜주세요!");
            return;
        }

        if ( game1 != null ) {
            game1.exit();
        } else if ( game2 != null ) {
            game2.exit();
        } else if ( game3 != null ) {
            game3.exit();
        } else {
            System.out.println("현재 칩이 장착되어있지 않습니다!");
        }

    }

    // 어떤칩 있는지 확인하기


}
