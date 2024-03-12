import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Create a Consumer that prints the input string to the console.
        Consumer<String> printConsumer = (str) -> System.out.println(str);

        // Pass the Consumer to a method that accepts a Consumer as an argument.
        consume(printConsumer);


    }

    private static void consume(Consumer<String> consumer) {
        consumer.accept("Hello, world!");
    }

}