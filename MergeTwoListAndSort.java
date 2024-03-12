import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoListAndSort {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(13, 21, 41);
        List<Integer> list2 = Arrays.asList(11, 31, 34);
        //o/p = [11,13,21,31,34,41]
        List<Integer> mergedlist = new ArrayList<>();
        mergedlist.addAll(list1);
        mergedlist.addAll(list2);
        Collections.sort(mergedlist);
        System.out.println(mergedlist);

        //list1.add(24);  UnsupportedOperationException (Immutable Abstractlist)
    }
}
