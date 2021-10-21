import java.util.ArrayList;
import java.util.List;

public class Kennistoets {

    private int kennistoetsId;
    private String naam;


    private List<Vraag> vragenLijst = new ArrayList<>();
    Vraag kav1 = new KortAntwoordVraag(1,"Wat is je favoriete kleur?",new Antwoord("rood"),5);
    Vraag kav2 = new KortAntwoordVraag(2,"Wat is je favoriete melk?",new Antwoord("wit"),3);
    Vraag kav3 = new KortAntwoordVraag(3,"Wat is je favoriete hond?",new Antwoord("hond"),12);
    Vraag mkv1 = new MeerkeuzeVraag(4,"Wat is je favoriete kaas?",new Antwoord("kaas"),8);
    Vraag mkv2 = new MeerkeuzeVraag(5,"Wat is je favoriete beer?",new Antwoord("Brother Bear"),10);

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
