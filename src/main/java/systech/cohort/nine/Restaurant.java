package systech.cohort.nine;

public abstract class Restaurant implements RestaurantI{//abstraction
    private String name;
    private String countryOwned;
    private boolean doDeliver;
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCountryOwned(String countryOwned) {//encapsulation
        this.countryOwned = countryOwned;
    }

    public boolean getDeliver() {
//        deliveries(doDeliver);
        return doDeliver;
    }

    public void setDoDeliver(boolean doDeliver) {
        this.doDeliver = doDeliver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOwned() {
        return countryOwned;
    }

    public void updateCountry(String name){
        if (name=="KFC"|| name=="MacDonald")
            setCountryOwned(this.countryOwned = "America");

        else
            setCountryOwned(this.countryOwned = "Kenya");
    }
    public String deliveries(){
        boolean deliver=getDeliver();
        if (deliver==true)
            return "We deliver food";
        else
            return "We dont deliver food";

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", countryOwned='" + countryOwned + '\'' +
                '}';
    }
}
