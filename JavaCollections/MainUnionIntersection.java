package JavaCollectionsPackage;

import java.util.*;

public class MainUnionIntersection {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
System.out.println(UnionIntersection.union(s1,s2));
System.out.println(UnionIntersection.intersection(s1,s2));
    }
}
