package JavaCollectionsPackage;

import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list){
Set<T> seen=new HashSet<>();
List<T> result=new ArrayList<>();
for(T i:list){if(seen.add(i))result.add(i);}return result;}
}
