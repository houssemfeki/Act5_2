package rmiClient;

import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) throws Exception {

        // Crée une instance du service RMI
        IConversion conversion = (IConversion) java.rmi.Naming.lookup("//localhost:1099/Conversion");

        // Convertit un montant en euros
        double montant = 100;
        double montantConverti = conversion.convertirMontant(montant);

        // Affiche le résultat de la conversion
        System.out.println("Le montant converti en dollars est de " + montantConverti);
    }

}
