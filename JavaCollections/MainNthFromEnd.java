package JavaCollectionsPackage;

import java.util.*;

public class MainNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
System.out.println(NthFromEnd.findNthFromEnd(list,2));
    }
}
