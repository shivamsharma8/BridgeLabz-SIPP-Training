package JavaCollectionsPackage;

import java.util.*;

public class GroupObjectsByProperty {
    static class Employee{String name,dept;Employee(String n,String d){name=n;dept=d;}}
public static Map<String,List<String>> group(List<Employee> emps){Map<String,List<String>> map=new HashMap<>();for(Employee e:emps)map.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e.name);return map;}
}
