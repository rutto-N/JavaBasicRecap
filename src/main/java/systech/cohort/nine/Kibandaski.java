package systech.cohort.nine;

public class Kibandaski extends Restaurant {
    private String name="Kibanda";
    private boolean deliver=false;
    private double rating=1.8;

    public Kibandaski() {
        super.setName(name);
        super.updateCountry(this.name);
        super.setDoDeliver(deliver);
        super.setRating(rating);
//        super.deliveries(deliver);

    }

}
