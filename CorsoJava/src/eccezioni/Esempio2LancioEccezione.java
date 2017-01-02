package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */

public class Esempio2LancioEccezione {

    public static void main(String[] args) {

        try{

            throw new Exception("Sono un'eccezione che hai lanciato a mano!");

        } catch(Exception e){

            System.out.println("Ho catturato l'eccezione!");
            System.out.println("Il messaggio Ë: " + e.getMessage());
            //e.printStackTrace();

        }

    }

}
