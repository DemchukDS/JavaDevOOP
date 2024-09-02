package Seminar_3;

import Seminar_3.impl.Asitromin;
import Seminar_3.impl.Penicilin;
import Seminar_3.impl.Vitbicid;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        MedComponent firstComponent = new Penicilin("Penicilin", 10, 3);
        MedComponent secondComponent = new Asitromin("Asitromin", 4, 4);
        MedComponent thirdComponent = new Vitbicid("Vetbicid", 4, 6);

        Medicine medicine1 = new Medicine();
        medicine1.addComponent(firstComponent).addComponent(secondComponent).addComponent(thirdComponent);

        Iterator<MedComponent> medComponent = medicine1;
        while (medComponent.hasNext()) {
            System.out.println(medComponent.next());
        }
    }
}
