package JavaCollectionsPackage;

import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list,int n){
int idx=list.size()-n;return list.get(idx);
}
}
