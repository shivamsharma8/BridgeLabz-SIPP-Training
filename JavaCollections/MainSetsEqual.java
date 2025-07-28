package JavaCollectionsPackage;

import java.util.*;

public class MainSetsEqual {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));Set<Integer> s2=new HashSet<>(Arrays.asList(3,2,1));
System.out.println(SetsEqual.areSetsEqual(s1,s2));
    }
}
