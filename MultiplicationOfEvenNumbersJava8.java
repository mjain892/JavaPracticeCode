import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplicationOfEvenNumbersJava8 {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,4,5,7,20,25,30);

        System.out.println(list.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(1, (a, b) -> (a * b)));

        System.out.println(list.stream()
                .filter(integer -> integer % 2 != 0)
                .reduce(1, (a, b) -> (a * b)));

    }
}
