package company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 46995932D on 09/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehiculoList = new ArrayList<>();

        Coche c1 = new Coche(1111111, 5, true, "A" );
        Microbus m1 = new Microbus(2222222, 20);
        Furgoneta f1 = new Furgoneta(3333333, 3, 2.075);
        Camion ca1 = new Camion(4444444, 5, 3.750);

        vehiculoList.add(c1);
        vehiculoList.add(m1);
        vehiculoList.add(f1);
        vehiculoList.add(ca1);

        System.out.println("Dime la matricula del vehiculo");


        for (Vehiculo vehiculo : vehiculoList) {



            System.out.println(vehiculo);
            System.out.println();

        }
    }
}
