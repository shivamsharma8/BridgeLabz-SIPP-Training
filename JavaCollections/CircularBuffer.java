package JavaCollectionsPackage;

import java.util.*;

public class CircularBuffer {
    static class CircularQ{int[] arr;int front=0,size=0;CircularQ(int cap){arr=new int[cap];}
void insert(int x){arr[(front+size)%arr.length]=x;if(size<arr.length)size++;else front=(front+1)%arr.length;}
List<Integer> get(){List<Integer> list=new ArrayList<>();for(int i=0;i<size;i++)list.add(arr[(front+i)%arr.length]);return list;}}
}
