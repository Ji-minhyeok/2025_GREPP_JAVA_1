package grepp.lec.part5.objects;

import grepp.lec.part5.objects.inner.mat.Character;
import grepp.lec.part5.objects.inner.mat.CharacterCompare;
import grepp.lec.part5.objects.inner.mat.CharacterGoldComparator;
import grepp.lec.part5.objects.inner.mat.CharacterLevelComparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Comparing {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
        test6();
    }

    private static void test6() {

        List<Character> userGuild = makeGuild(10);

//        userGuild.sort((o1, o2) -> {
//
//            int result = Integer.compare(o1.getGold(), o2.getGold());
//
//            if ( result == 0 ) {
//                result = Integer.compare(o1.getLevel(), o2.getLevel());
//            }
//            return result;
//        });

//        userGuild.sort(
//                Comparator.comparing(
//                        (Character c)-> c.getGold(), Comparator.reverseOrder()
//                ).thenComparing(
//                        (Character c ) -> c.getLevel()
//                )
//        );

        userGuild.sort(Comparator.comparing(Character::getGold, Comparator.reverseOrder()).thenComparing(Character::getLevel)

        );

    }

    private static void test5() {

        List<Character> userGuild = makeGuild(10);
        System.out.println("userGuild = " + userGuild);

        // Spring Application -> Database
        CharacterGoldComparator goldComparator = new CharacterGoldComparator();
        CharacterLevelComparator levelComparator = new CharacterLevelComparator();

        userGuild.sort(goldComparator);
        userGuild.sort(levelComparator);

        System.out.println("userGuild = " + userGuild);

        /*
        userGuild = [
        Character{name='user_1', level=62, gold=2851, inventory=[item_1, item_2, item_3]},
        Character{name='user_2', level=11, gold=6440, inventory=[item_1, item_2, item_3]},
        Character{name='user_3', level=93, gold=143, inventory=[item_1]},
        Character{name='user_4', level=87, gold=9841, inventory=[item_1, item_2, item_3]},
        Character{name='user_5', level=13, gold=9673, inventory=[item_1, item_2]},
         Character{name='user_6', level=52, gold=4125, inventory=[item_1, item_2]},
          Character{name='user_7', level=21, gold=1073, inventory=[item_1]},
           Character{name='user_8', level=37, gold=976, inventory=[item_1]},
            Character{name='user_9', level=8, gold=6034, inventory=[item_1, item_2]},
             Character{name='user_10', level=26, gold=928, inventory=[item_1, item_2]}
             ]



        userGuild = [
        Character{name='user_9', level=8, gold=6034, inventory=[item_1, item_2]},
        Character{name='user_2', level=11, gold=6440, inventory=[item_1, item_2, item_3]},
        Character{name='user_5', level=13, gold=9673, inventory=[item_1, item_2]},
        Character{name='user_7', level=21, gold=1073, inventory=[item_1]},
        Character{name='user_10', level=26, gold=928, inventory=[item_1, item_2]},
         Character{name='user_8', level=37, gold=976, inventory=[item_1]},
          Character{name='user_6', level=52, gold=4125, inventory=[item_1, item_2]},
           Character{name='user_1', level=62, gold=2851, inventory=[item_1, item_2, item_3]},
           Character{name='user_4', level=87, gold=9841, inventory=[item_1, item_2, item_3]},
           Character{name='user_3', level=93, gold=143, inventory=[item_1]}
           ]
         */


    }

    private static void test4() {

        List<Character> userGuild = makeGuild(10);

        System.out.println("userGuild = " + userGuild);

        // gold순으로 정렬
        CharacterGoldComparator comparator = new CharacterGoldComparator();
        userGuild.sort(comparator);

        System.out.println("userGuild = " + userGuild);

        /*
        userGuild = [Character{name='user_1', level=74, gold=2605, inventory=[item_1]},
        Character{name='user_2', level=13, gold=5000, inventory=[item_1]},
        Character{name='user_3', level=92, gold=5821, inventory=[item_1, item_2]},
         Character{name='user_4', level=81, gold=5334, inventory=[item_1, item_2]},
          Character{name='user_5', level=75, gold=2784, inventory=[item_1, item_2, item_3, item_4]},
           Character{name='user_6', level=1, gold=8612, inventory=[item_1]},
           Character{name='user_7', level=59, gold=453, inventory=[item_1, item_2, item_3, item_4, item_5, item_6]},
           Character{name='user_8', level=26, gold=2888, inventory=[item_1, item_2, item_3]},
           Character{name='user_9', level=35, gold=8680, inventory=[item_1, item_2, item_3, item_4, item_5, item_6, item_7]},
           Character{name='user_10', level=22, gold=9771, inventory=[item_1, item_2, item_3, item_4, item_5]}]



        userGuild = [
        Character{name='user_7', level=59, gold=453, inventory=[item_1, item_2, item_3, item_4, item_5, item_6]},
        Character{name='user_1', level=74, gold=2605, inventory=[item_1]},
        Character{name='user_5', level=75, gold=2784, inventory=[item_1, item_2, item_3, item_4]},
        Character{name='user_8', level=26, gold=2888, inventory=[item_1, item_2, item_3]},
        Character{name='user_2', level=13, gold=5000, inventory=[item_1]},
        Character{name='user_4', level=81, gold=5334, inventory=[item_1, item_2]},
         Character{name='user_3', level=92, gold=5821, inventory=[item_1, item_2]},
          Character{name='user_6', level=1, gold=8612, inventory=[item_1]},
           Character{name='user_9', level=35, gold=8680, inventory=[item_1, item_2, item_3, item_4, item_5, item_6, item_7]},
            Character{name='user_10', level=22, gold=9771, inventory=[item_1, item_2, item_3, item_4, item_5]}]

        // 정렬 안되어있음
        userGuild = [Character{name='user_1', level=28, gold=5922, inventory=[item_1, item_2, item_3]},
        Character{name='user_2', level=32, gold=2532, inventory=[item_1, item_2, item_3]},
        Character{name='user_3', level=21, gold=7317, inventory=[item_1, item_2, item_3]},
         Character{name='user_4', level=88, gold=4225, inventory=[item_1, item_2, item_3]},
          Character{name='user_5', level=82, gold=3482, inventory=[item_1]},
          Character{name='user_6', level=91, gold=1679, inventory=[item_1, item_2, item_3]},
          Character{name='user_7', level=54, gold=7348, inventory=[item_1, item_2]},
          Character{name='user_8', level=81, gold=6669, inventory=[item_1, item_2]},
           Character{name='user_9', level=64, gold=1781, inventory=[item_1, item_2, item_3]},
           Character{name='user_10', level=24, gold=2867, inventory=[item_1, item_2]}]


        // 정렬이 되어있음
    userGuild = [Character{name='user_7', level=54, gold=7348, inventory=[item_1, item_2]},
    Character{name='user_3', level=21, gold=7317, inventory=[item_1, item_2, item_3]},
     Character{name='user_8', level=81, gold=6669, inventory=[item_1, item_2]},
     Character{name='user_1', level=28, gold=5922, inventory=[item_1, item_2, item_3]},
     Character{name='user_4', level=88, gold=4225, inventory=[item_1, item_2, item_3]},
      Character{name='user_5', level=82, gold=3482, inventory=[item_1]},
      Character{name='user_10', level=24, gold=2867, inventory=[item_1, item_2]},
       Character{name='user_2', level=32, gold=2532, inventory=[item_1, item_2, item_3]},
        Character{name='user_9', level=64, gold=1781, inventory=[item_1, item_2, item_3]},
         Character{name='user_6', level=91, gold=1679, inventory=[item_1, item_2, item_3]}]

         */

    }

    private static ArrayList<Character> makeGuild(int guildSize) {
        return new ArrayList<>(
            IntStream.rangeClosed(1, guildSize)
                    .mapToObj(
                    i -> generateCharacter(i
                            , generateRandomNumber(100)
                            , generateRandomNumber(10_000)
                            , generateRandomNumber(3))
                    ).toList());
    }

    private static void test3() {

        int PARTY_SIZE = 5;

        List<CharacterCompare> raidParty = makeParty(PARTY_SIZE);
        System.out.println("raidParty = " + raidParty);

        raidParty.sort(null);
        System.out.println("raidParty = " + raidParty);

    }

    private static ArrayList<CharacterCompare> makeParty(int partySize) {
        return new ArrayList<>(
                IntStream.rangeClosed(1, partySize)
                        .mapToObj(i -> new CharacterCompare("user_" + i
                                , generateRandomNumber(100)
                                , generateRandomNumber(10_000)
                                , generateRandomNumber(10))
                        )
                        .toList()
        );
    }

    static int generateRandomNumber(int size) {
        return (int) (Math.random() * size) + 1;
    }

    private static void test2() {

        CharacterCompare user1 = new CharacterCompare(
                "user_2"
                , 15
                , 1_000
                , 2
        );
        CharacterCompare user2 = new CharacterCompare(
                "user_2"
                , 15
                , 1_000
                , 2
        );

        // user1이 더크면 1
        // user2가 더크면 -1
        // 같다면 0
        int isUser1HigherThanUser2 = user1.compareTo(user2);

        System.out.println("isUser1HigherThanUser2 = " + isUser1HigherThanUser2);


    }

    private static Character generateCharacter(int userNumber, int userLevel, int userGold, int itemAmount) {
        String PREFIX = "user_";
        return new Character(
                PREFIX + userNumber
                , userLevel
                , userGold
                , itemAmount
        );
    }

    private static void test1() {

        Character user1 = new Character(
                "user_1"
                , 10
                , 10_000
                , 10
        );

        Character user2 = new Character(
                "user_2"
                , 15
                , 1_000
                , 2
        );

    }


}
