public class PuntenTelling {
    private static final long SNELLE_TIJD = 2;
    private static final long MEDIUM_TIJD = 5;
    private PuntenTellingStrategie strategie;

    public PuntenTellingStrategie berekenStrategie(long tijd){
        if(tijd < SNELLE_TIJD){
            return new HogePuntenStrategie();
        }
        else if(tijd < MEDIUM_TIJD){
            return new MediumPuntenStrategie();
        }
        else{
            return new LagePuntenStrategie();
        }
    }

    public int voerPuntenTellingUit(long tijd){
        strategie = berekenStrategie(tijd);
        return strategie.geefPunten();
    }
}
