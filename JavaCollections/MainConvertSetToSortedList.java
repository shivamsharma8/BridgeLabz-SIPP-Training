package JavaCollectionsPackage;

import java.util.*;

public class MainConvertSetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(Arrays.asList(5,3,9,1));
System.out.println(ConvertSetToSortedList.convert(set));
    }
}
