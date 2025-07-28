package JavaCollectionsPackage;

import java.util.*;

public class MainSymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
System.out.println(SymmetricDifference.symmetricDiff(s1,s2));
    }
}
