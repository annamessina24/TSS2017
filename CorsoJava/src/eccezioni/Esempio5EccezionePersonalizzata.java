package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */

public class Esempio5EccezionePersonalizzata{

    public static void main(String[] args) {

        try {
            test(1); //non lancia eccezione
            test(0); //lancia eccezione
        } catch(MiaEccezionePersonalizzata miaEccezionePersonalizzata){
            miaEccezionePersonalizzata.getMessage();
            miaEccezionePersonalizzata.dettagli();
        }

    }

    public static void test(int i) throws MiaEccezionePersonalizzata {

        if(i==0) throw new MiaEccezionePersonalizzata();

    }

}
