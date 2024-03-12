import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupBy {

    public static void main(String[] args){
        List<String> list = Arrays.asList("Mumbai", "Madurai", "Pune", "Patiyala", "Goa");

        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(city -> city.charAt(0)));

        System.out.println(map);

//        List<String> list2 = Arrays.asList("Mysore", "Madurai", "Poona");
//
//        System.out.println(list.retainAll(list2));




    }
}
