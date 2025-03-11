package grepp.lec.part5.annotation;

import java.lang.annotation.*;

//@Retention()
//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Apple {
    String value() default "";
    int range();
}
