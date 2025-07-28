package JavaCollectionsPackage;

import java.util.*;

public class KeyWithHighestValue {
    public static String findKey(Map<String,Integer> map){return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();}
}
