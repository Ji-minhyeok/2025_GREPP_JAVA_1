package grepp.lec.part7.s1;

import java.util.Objects;

public class Optional<T> {

    private final T data;

    private Optional(T data) {
        this.data = data;
    }

    public static <T> Optional<T> empty() {
        return new Optional<>(null);
    }

    public static <T> Optional<T> of(T value) {
        return new Optional<>(Objects.requireNonNull(value));
    }

    public static <T> Optional<T> ofNullable(T value) {
        return value == null
                ? new Optional<>(null)
                : new Optional<>(value);
    }

    public T get() {
        if ( data == null ){
            throw new NoSuchElementException("No value present");
        }
        return data;
    }

    public boolean isPresent() {
        return data != null;
    }

    public boolean isEmpty() {
        return data == null;
    }

}
