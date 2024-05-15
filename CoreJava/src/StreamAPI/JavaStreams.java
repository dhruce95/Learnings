package StreamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        sum();

        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        square();
    }

    static void sum() {
        System.out.println(IntStream.range(1, 10)
                .sum());
    }

    static void square() {
        IntStream.of(2, 4, 6, 8, 10)
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}