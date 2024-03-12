import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalInterfaces {

    public static void main(String[] args){
        // Using the Predicate functional interface
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10)); // Output: true


        // Using the Function functional interface
        Function<Integer, String> intToString = String::valueOf;
        String numAsString = intToString.apply(42);
        System.out.println("Number as string: " + numAsString); // Output: "42"

        //The Consumer interface is a functional interface in Java 8
        //which means that it has a single abstract method.
        // The method in the Consumer interface is called accept(),
        // which takes an input argument and returns no result.
        // The Consumer interface is used to represent operations that consume data.

        //forEach() method in the Stream API takes a Consumer as an argument.
        // This allows you to perform an operation on each element of a stream.

        Consumer<String> printConsumer = System.out::println;
        // Consume the string "Hello, world!" using the printConsumer.
        printConsumer.accept("Hello, world!");

        Stream<String> stringStream = Stream.of("Hello", "world!");

        // Consume each element of the stream using the printConsumer.
        stringStream.forEach(printConsumer);



//        The Producer interface represents an operation that produces a result of a given type. It is also a functional interface,
//        which means that it can be used as the assignment target for a lambda expression or method reference.

    }
}
