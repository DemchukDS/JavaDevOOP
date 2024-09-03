package Seminar_3.HW;

import Seminar_3.impl.Asitromin;
import Seminar_3.impl.Penicilin;
import Seminar_3.impl.Vitbicid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        MedComponent firstComponent = new Penicilin("Penicilin", 10, 4);
        MedComponent secondComponent = new Asitromin("Asitromin", 4, 1);
        MedComponent thirdComponent = new Vitbicid("Vetbicid", 4, 6);

        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(firstComponent).addComponent(secondComponent).addComponent(thirdComponent);

        /**
         * Solution with Iterator.
        Iterator<MedComponent> medComponent = medicine1;
        while (medComponent.hasNext()) {
            System.out.println(medComponent.next());
        }
        */


        /**
         * Solution with Iterable.
         */
        // for (MedComponent medComponent : medicine1) {
        //     System.out.println(medComponent);
        // }
        ArrayList<MedComponent> componentsArray = new ArrayList<>();
        componentsArray.add(firstComponent);
        componentsArray.add(secondComponent);
        componentsArray.add(thirdComponent);
        System.out.println(componentsArray);

        Collections.sort(componentsArray, Comparator.reverseOrder());
        System.out.println(componentsArray);

        ArrayList<Medicine> medicineList = new ArrayList<>();
        
    }
}
