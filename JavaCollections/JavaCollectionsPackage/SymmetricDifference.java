package JavaCollectionsPackage;

import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDiff(Set<T> s1,Set<T> s2){Set<T> res=new HashSet<>(s1);res.addAll(s2);
Set<T> tmp=new HashSet<>(s1);tmp.retainAll(s2);res.removeAll(tmp);return res;}
}
