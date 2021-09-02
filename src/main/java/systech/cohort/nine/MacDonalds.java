package systech.cohort.nine;

public class MacDonalds extends Restaurant {
    private String name="MacDonald";
    private boolean deliver=true;
    private double rating=2.8;



    public MacDonalds() {
        super.setName(name);
        super.updateCountry(this.name);
        super.setDoDeliver(deliver);
        super.setRating(rating);


    }
    public boolean deliver() {
        return deliver;
    }
}
