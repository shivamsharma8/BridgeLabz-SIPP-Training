package JavaCollectionsPackage;

import java.util.*;

public class StackUsingQueues {
    static class MyStack{Queue<Integer> q1=new LinkedList<>(),q2=new LinkedList<>();
void push(int x){q1.add(x);}int pop(){while(q1.size()>1)q2.add(q1.remove());int val=q1.remove();Queue<Integer> temp=q1;q1=q2;q2=temp;return val;}int top(){while(q1.size()>1)q2.add(q1.remove());int val=q1.peek();q2.add(q1.remove());Queue<Integer> tmp=q1;q1=q2;q2=tmp;return val;}}
}
