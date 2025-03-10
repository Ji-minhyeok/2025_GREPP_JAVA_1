package grepp.lec.part5.extends_example.final_keyword.s1;

public class FinalKeyword {

    public static void main(String[] args) {

        final String DATABASE_URL;

        DATABASE_URL = "jdbc:mariadb://localhost:3306/test-db";
        System.out.println("DATABASE_URL = " + DATABASE_URL);

        final int A = 10;

    }

}
