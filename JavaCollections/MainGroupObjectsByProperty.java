package JavaCollectionsPackage;

import java.util.*;

public class MainGroupObjectsByProperty {
    public static void main(String[] args) {
        List<GroupObjectsByProperty.Employee> emps=Arrays.asList(new GroupObjectsByProperty.Employee("Alice","HR"),new GroupObjectsByProperty.Employee("Bob","IT"),new GroupObjectsByProperty.Employee("Carol","HR"));
System.out.println(GroupObjectsByProperty.group(emps));
    }
}
