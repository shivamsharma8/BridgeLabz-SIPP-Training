package JavaCollectionsPackage;

import java.util.*;

public class HospitalTriage {
    static class Patient{String name;int severity;Patient(String n,int s){name=n;severity=s;}}
public static List<String> triage(List<Patient> patients){PriorityQueue<Patient> pq=new PriorityQueue<>((a,b)->b.severity-a.severity);
pq.addAll(patients);List<String> order=new ArrayList<>();while(!pq.isEmpty())order.add(pq.poll().name);return order;}
}
