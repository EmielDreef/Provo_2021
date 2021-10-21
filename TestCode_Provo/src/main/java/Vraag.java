public interface Vraag {

	public int id;

	public char beschrijving;

	public int punten;

	public Antwoord correctAntwoord;

	public abstract boolean vergelijkAntwoorden(Antwoord gegevenAntwoord);

}
