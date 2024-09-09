package Seminar_3.HW;

import Seminar_3.impl.Asitromin;
import Seminar_3.impl.Penicilin;
import Seminar_3.impl.Vitbicid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {

        Medicine medicine1 = new Medicine("Boris");
        MedComponent m1component1 = new Penicilin("Penicilin", 10, 4);
        MedComponent m1component2 = new Asitromin("Asitromin", 4, 1);
        MedComponent m1component3 = new Vitbicid("Vetbicid", 4, 6);
        medicine1.addMedicine(medicine1.addComponent(m1component1).addComponent(m1component2).addComponent(m1component3));

        Medicine medicine2 = new Medicine("Liva");
        MedComponent m2component1 = new Penicilin("Penicilin", 3, 14);
        MedComponent m2component2 = new Asitromin("Asitromin", 6, 6);
        medicine2.addMedicine(medicine2.addComponent(m2component1).addComponent(m2component2));

        Medicine medicine3 = new Medicine("Filipp");
        MedComponent m3component1 = new Penicilin("Penicilin", 12, 5);
        MedComponent m3component2 = new Vitbicid("Vetbicid", 8, 5);
        medicine3.addMedicine(medicine3.addComponent(m3component1).addComponent(m3component2));        
        
        ArrayList<Medicine> medicinesArray = new ArrayList<>();
        medicinesArray.add(medicine1);
        medicinesArray.add(medicine2);
        medicinesArray.add(medicine3);
        System.out.println(medicinesArray);

        Collections.sort(medicinesArray);
        System.out.println(medicinesArray);
    }
}
