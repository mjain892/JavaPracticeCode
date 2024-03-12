import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    int i;
}
class Main {
    public static void main(String args[]) {
        System.out.println(Stream.of(1, 1, 2, 3, 5, 8, 8)
                .peek(System.out::println)
                .filter(x -> x == 8)
                .count());

        System.out.println(Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList()));

        //difference in peek and filter
    }
}