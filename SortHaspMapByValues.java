import java.util.*;
import java.util.stream.Collectors;

public class SortHaspMapByValues {

    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 1);
        map.put("THREE", 3);
        map.put("TWO", 2);
        map.put("FIVE", 5);

        System.out.println(map);
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(map.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println(temp);

        // Solution 2

        HashMap<String, Integer> newMap
                = map.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(newMap);
    }
}
