package systech.cohort.nine;

public class KFC extends Restaurant {//inheritance
    private String name="KFC";
    private boolean deliver=false;
    private double rating=3.0;

    public KFC() {
        super.setName(name);
        super.updateCountry(this.name);
        super.setDoDeliver(deliver);
        super.setRating(rating);

    }

}
