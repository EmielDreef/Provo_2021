import Vragen.Vraag;
import java.util.List;
import java.util.Scanner;

public class Provo {
    private static final PuntenTelling puntenTelling = new PuntenTelling();
    private static long behaaldePunten = 0;
    private static long maxPunten;
    private static KennisToetsTimer vraagTimer = new KennisToetsTimer();
    public static void main(String[] args){
        List<Vraag> vragenLijst = new Kennistoets().getVragenLijst();
        maxPunten = vragenLijst.size() * 5;
        for(Vraag vraag: vragenLijst) {
            vraagTimer.start();
            Scanner scanner = new Scanner(System.in);
            System.out.println(vraag.getVraag());
            String studentAntwoord = scanner.nextLine();
            vraagTimer.stop();
            if(vraag.getCorrectAntwoord().equals(studentAntwoord)){
                behaaldePunten += puntenTelling.voerPuntenTellingUit(vraagTimer.getVerlopenSeconden());
            }
        }
        System.out.println(printResultaten());
    }

    private static String printResultaten() {
        return "Je hebt " + behaaldePunten + " van de " + maxPunten + " punten behaald";
    }
}
