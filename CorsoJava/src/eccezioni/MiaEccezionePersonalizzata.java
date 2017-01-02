package eccezioni;

/**
 * Created by sviluppo on 06/12/2016.
 */

public class MiaEccezionePersonalizzata extends Exception{

    public MiaEccezionePersonalizzata() {

        super("Mia eccezione");

    }

    public String dettagli(){
        return "Dettagli mia eccezione";
    }
}
