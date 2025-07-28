package JavaCollectionsPackage;

import java.util.*;

public class ConvertSetToSortedList {
    public static List<Integer> convert(Set<Integer> set){List<Integer> list=new ArrayList<>(set);Collections.sort(list);return list;}
}
