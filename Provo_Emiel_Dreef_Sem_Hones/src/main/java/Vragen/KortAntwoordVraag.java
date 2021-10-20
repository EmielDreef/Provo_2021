package Vragen;

import Vragen.Vraag;

public class KortAntwoordVraag implements Vraag {
    private String vraag;
    private String correctAntwoord;

    public KortAntwoordVraag(String vraag, String correctAntwoord){
        this.vraag = vraag;
        this.correctAntwoord = correctAntwoord;
    }

    @Override
    public String getCorrectAntwoord() {
        return correctAntwoord;
    }

    @Override
    public String getVraag() {
        return vraag;
    }

    @Override
    public void setCorrectAntwoord(String correctAntwoord) {
        this.correctAntwoord = correctAntwoord;
    }

    @Override
    public void setVraag(String vraag) {
        this.vraag = vraag;
    }
}
