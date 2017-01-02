package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */

public class Esempio4Finally {

    public static void main(String[] args) {

        test();

    }

    private static void test() {

        try{
            System.out.println("Blocco TRY esterno");

            try{
                System.out.println("Blocco TRY interno");
                throw new Exception("Ciao dall'interno!");
            } catch(ArithmeticException e){
                System.out.println("Blocco CATCH interno");
            } finally {
                System.out.println("Blocco FINALLY interno");
            }

        } catch(Exception e){
            System.out.println("Blocco CATCH esterno");
        } finally{
            System.out.println("Blocco FINALLY esterno");
        }

    }

}
