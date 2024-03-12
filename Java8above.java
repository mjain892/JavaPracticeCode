import java.util.*;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;
import static java.util.Map.entry;

public class Java8above {

    public static void main(String[] args){
        List<Integer> list = List.of(1, 2, 3, 7, 9, 2, 6);
        Predicate<Integer> p = i-> i < 5;
        list.stream()
                .filter(p)  // 6filter (from Java 8) - filter through the entire stream
                .forEach(System.out::print);    // 1232

        System.out.println();

        // takeWhile - like filter(), but exit the stream as soon as the predicate does NOT match the 1st time
        list.stream().takeWhile(p).forEach(System.out::print); //123
        System.out.println();

        // dropWhile - remove elements while the given predicate returns true
        // and stops removing (but keeps going) when the predicate returns false for the 1st time
        list.stream().dropWhile(p).forEach(System.out::print);
        System.out.println();

        // trick to extract a chunk of string
        String chunk = """
                Lorem ipsum
                ============
                This is the text
                That we care about
                ============
                Lorem ipsum
                """;
        // task: extract the text between "=========="
        String separator = "==========";
        chunk.lines()
                .dropWhile(l -> !l.contains(separator))
                .skip(1)
                .takeWhile(l -> !l.contains(separator))
                .forEach(System.out::println);


        // new factory methods - create unmodifiable (!) collections
        // i.e.  set(), add() and other modifying methods throw UnsupportedOperationException
        List<Integer> list1 = List.of(1, 2, 3);
        //list1.add(5);  Immutable Collection Object
        System.out.println(list1);
        Set<String> set = Set.of("a", "b");
        //set.add("c");
        System.out.println(set);
        Map<String, String> map = Map.of("key1", "val1", "key2", "val2");
        //map.put("key3", "val3");
        System.out.println(map);

        // Map.of() has 10 overloaded methods accepting up to 10 Key-Value pairs
        // To create a map with 11+ elements:
        Map<String, String> test2 = Map.ofEntries(
                entry("key1", "val1"),
                entry("key2", "val2")
                //entry("key2", "val2")
                // etc.
        );
        System.out.println(test2);

        // older ways
        List<Integer> listOld = Arrays.asList(1, 2, 3);
        //listOld.add(4);
        System.out.println(listOld);

        Map<String, String> mapOld = new HashMap<>();
        mapOld.put("key1", "mapOld1");
        mapOld.put("key2", "mapOld2");
        mapOld.put("key3", "mapOld3");
        System.out.println(mapOld);

        System.out.println("*******************************************************");

        Map<String, String> hashMapmap = new HashMap<>();
        hashMapmap.put("key1", "hashMapmap1");
        hashMapmap.put("key2", "hashMapmap2");
        hashMapmap.put("key3", "hashMapmap3");
        System.out.println(hashMapmap);

        Map<String, String> syncMap =  Collections.synchronizedMap(hashMapmap);
        System.out.println(syncMap);

    }
}
