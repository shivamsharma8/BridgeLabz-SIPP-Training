package JavaCollectionsPackage;

import java.util.*;

public class MergeMaps {
    public static Map<String,Integer> merge(Map<String,Integer> m1,Map<String,Integer> m2){Map<String,Integer> res=new HashMap<>(m1);for(Map.Entry<String,Integer> e:m2.entrySet())res.merge(e.getKey(),e.getValue(),Integer::sum);return res;}
}
