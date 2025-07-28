package JavaCollectionsPackage;

import java.util.*;

public class MainCircularBuffer {
    public static void main(String[] args) {
        CircularBuffer.CircularQ cb=new CircularBuffer.CircularQ(3);cb.insert(1);cb.insert(2);cb.insert(3);cb.insert(4);
System.out.println(cb.get());
    }
}
