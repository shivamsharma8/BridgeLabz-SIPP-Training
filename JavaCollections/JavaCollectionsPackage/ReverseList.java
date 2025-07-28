package JavaCollectionsPackage;

import java.util.*;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) reversed.add(list.get(i));
        return reversed;
    }
}
