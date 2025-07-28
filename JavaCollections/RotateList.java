package JavaCollectionsPackage;

import java.util.*;

public class RotateList {
    public static <T> List<T> rotateList(List<T> list,int k){
Collections.rotate(list,k);
return list;
}
}
