package JavaCollectionsPackage;

import java.util.*;

public class UnionIntersection {
    public static <T> Set<T> union(Set<T> s1,Set<T> s2){Set<T> u=new HashSet<>(s1);u.addAll(s2);return u;}
public static <T> Set<T> intersection(Set<T> s1,Set<T> s2){Set<T> i=new HashSet<>(s1);i.retainAll(s2);return i;}
}
