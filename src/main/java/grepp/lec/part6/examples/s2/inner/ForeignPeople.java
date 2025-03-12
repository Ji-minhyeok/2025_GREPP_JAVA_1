package grepp.lec.part6.examples.s2.inner;

public class ForeignPeople extends People {

    public static String MOTHER_TONGUE = "ENGLISH";

    public ForeignPeople() {
        super(new LanguageType(MOTHER_TONGUE));
    }

    public ForeignPeople(boolean hasTranslator) {
        super(new LanguageType(MOTHER_TONGUE), hasTranslator);
    }
    
}
