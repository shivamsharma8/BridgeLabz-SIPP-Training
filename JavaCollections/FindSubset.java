package JavaCollectionsPackage;

import java.util.*;

public class FindSubset {
    public static <T> boolean isSubset(Set<T> small,Set<T> big){return big.containsAll(small);}
}
