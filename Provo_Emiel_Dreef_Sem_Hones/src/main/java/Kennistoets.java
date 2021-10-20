import Vragen.KortAntwoordVraag;
import Vragen.MeerkeuzeVraag;
import Vragen.Vraag;

import java.util.ArrayList;
import java.util.List;

public class Kennistoets {

    private List<Vraag> vragenLijst = new ArrayList<>();
    Vraag kav1 = new KortAntwoordVraag("Wat is je favoriete kleur?","rood");
    Vraag kav2 = new KortAntwoordVraag("Wat is je favoriete melk?","wit");
    Vraag kav3 = new KortAntwoordVraag("Wat is je favoriete hond?","hond");
    Vraag mkv1 = new MeerkeuzeVraag("Wat is je favoriete kaas?","kaas");
    Vraag mkv2 = new MeerkeuzeVraag("Wat is je favoriete beer?","Brother Bear");

    public Kennistoets(){
        vragenLijst.add(kav1);
        vragenLijst.add(kav2);
        vragenLijst.add(kav3);
        vragenLijst.add(mkv1);
        vragenLijst.add(mkv2);
    }

    public void setVragenLijst(List<Vraag> vragenLijst){
        this.vragenLijst = vragenLijst;
    }

    public List<Vraag> getVragenLijst(){
        return vragenLijst;
    }
}
