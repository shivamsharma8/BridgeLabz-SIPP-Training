package JavaCollectionsPackage;

import java.util.*;

public class MainInvertMap {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();m.put("A",1);m.put("B",2);m.put("C",1);
System.out.println(InvertMap.invert(m));
    }
}
