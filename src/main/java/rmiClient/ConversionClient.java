package rmiClient;

import rmiService.IConversion;
import java.rmi.Naming;

public class ConversionClient {

    public static void main(String[] args) {

        try {

            IConversion service =
                    (IConversion) Naming.lookup(
                            "rmi://localhost:1099/BK");

            double resultat =
                    service.convertirMontant(500);

            System.out.println(
                    "500 Euro = " + resultat + " DT");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
