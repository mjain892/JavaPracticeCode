import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java program to remove duplicates characters from given String.
public class RemoveDulpicateCharacters {

    public static void main(String[] args){
        removeduplicate("Mayank");
    }

    private static void removeduplicate(String str) {
         str.chars()
                .mapToObj(value -> (char)value)
                .collect(Collectors.toSet()).forEach(System.out::print);

         System.out.println("*********************");

        Arrays.stream(str.split(""))
                .collect(Collectors.toSet()).forEach(System.out::print);

        System.out.println("*********************");
        System.out.println("*********************");

        System.out.println(Arrays.stream(str.split(""))
                .distinct()
                .toList());


//        char[] charArray = str.toCharArray();
//        System.out.println(list.stream().toList());
        //return str;


    }

}
