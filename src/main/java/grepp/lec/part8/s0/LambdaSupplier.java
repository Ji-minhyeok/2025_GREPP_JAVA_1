package grepp.lec.part8.s0;

import java.util.UUID;
import java.util.function.Supplier;

public class LambdaSupplier {

    public static void main(String[] args) {

        Supplier<String> stringSupplier1 = () -> {
            return "Hello World!";
        };
        String secretValue1 = stringSupplier1.get();
        System.out.println("secretValue1 = " + secretValue1);

        Supplier<String> stringSupplier2 = () -> "Hello World!";
        String secretValue2 = stringSupplier2.get();
        System.out.println("secretValue2 = " + secretValue2);

        Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);

        Integer randomNumber = randomIntSupplier.get();
        System.out.println("randomNumber = " + randomNumber);

        Supplier<String> stringSupplier3 = () -> UUID.randomUUID().toString();

        Supplier<User> userSupplier = () -> new User(
                stringSupplier3.get(), randomIntSupplier.get()
        );

        User createdUser = userSupplier.get();
        System.out.println("createdUser = " + createdUser);

    }

    static class User {

        public String name;
        public int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }

}
