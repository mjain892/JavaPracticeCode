import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapsInJava {

    public static void main(String[] args){
        //whenRemoveAndAddOnHashMap_thenConcurrentModificationError
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "baeldung");
        map.put(2, "HashMap");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
//        while (iterator.hasNext()) {
//            synchronizedMap.put(3, "Modification");
//            iterator.next();
//        }
        for (Map.Entry<Integer, String> integerStringEntry : synchronizedMap.entrySet()) {
//            synchronizedMap.put(3, "Modification");
        }

        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "baeldung");
        concurrentHashMap.put(2, "HashMap");

        for (Map.Entry<Integer, String> integerStringEntry : concurrentHashMap.entrySet()) {
            concurrentHashMap.put(3, "Modification");
        }
        System.out.println(concurrentHashMap);

    }
}
