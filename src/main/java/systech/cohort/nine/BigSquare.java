package systech.cohort.nine;

public class BigSquare extends Restaurant{
    private String name="BigSquare";
    private boolean deliver=true;
    private double rating=3;

    public BigSquare() {
        super.setName(name);
        super.updateCountry(this.name);
        super.setDoDeliver(deliver);
        super.setRating(rating);

    }


}
