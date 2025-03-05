package grepp.lec.part1.datatype;

public class BooleanType {

    public static void main(String[] args) {
        // # 1-4. 논리 자료형
        // boolean

        /*
        boolean: The boolean data type has only two possible values: true and false.
        Use this data type for simple flags that track true/false conditions.

        This data type represents one bit of information, but its "size" isn't something that's precisely defined

        - 참고: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         */

        boolean isJavaDifficult = false;
        boolean hasHappiness = true;

        System.out.println("isJavaDifficult = " + isJavaDifficult); // false
        System.out.println("hasHappiness = " + hasHappiness); // true
    }

}
