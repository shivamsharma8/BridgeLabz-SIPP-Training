package JavaCollectionsPackage;

import java.util.*;

public class MainHospitalTriage {
    public static void main(String[] args) {
        List<HospitalTriage.Patient> pts=Arrays.asList(new HospitalTriage.Patient("John",3),new HospitalTriage.Patient("Alice",5),new HospitalTriage.Patient("Bob",2));
System.out.println(HospitalTriage.triage(pts));
    }
}
