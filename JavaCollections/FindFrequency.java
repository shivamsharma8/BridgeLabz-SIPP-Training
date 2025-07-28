package JavaCollectionsPackage;

import java.util.*;

public class FindFrequency {
    public static Map<String,Integer> countFrequency(List<String> list){
Map<String,Integer> map=new HashMap<>();
for(String s:list) map.put(s,map.getOrDefault(s,0)+1);
return map;
}
}
