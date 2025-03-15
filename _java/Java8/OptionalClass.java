package _java.Java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> user = getOptional(2);
        Optional<String> optional = getOptional(-1);

        user.ifPresent(System.out::println);
        optional.ifPresent(System.out::println);

        if (user.isPresent()) {
            System.out.println(user.get());
        }
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        System.out.println(user.orElse("No User Found :("));
        System.out.println(optional.orElse("No User Found :("));

        System.out.println(user.orElseGet(() -> "No User Found :("));
        System.out.println(optional.orElseGet(() -> "No User Found :("));

        System.out.println(user.orElseThrow(NoSuchElementException::new));
        System.out.println(optional.orElseThrow(NoSuchElementException::new));

    }

    private static Optional<String> getOptional(Integer n) {
        if (n < 0) {
            return Optional.empty();
        }
        return Optional.ofNullable("Hi User");
    }
}
