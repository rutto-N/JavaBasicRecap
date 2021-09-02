package systech.cohort.nine;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        List<Restaurant> restaurantList=new ArrayList<Restaurant>();//Polymorphism

        Restaurant kfc=new KFC();//Polymorphism
        System.out.println("Restaurant name: "+kfc.getName()+", Country: "+kfc.getCountryOwned()+", do deliveries?: "
                +kfc.deliveries()+", Rating: "+kfc.getRating());
        restaurantList.add(kfc);

        Restaurant kibanda=new Kibandaski();//Polymorphism
        System.out.println("Restaurant name: "+kibanda.getName()+", Country: "+kibanda.getCountryOwned()+", do deliveries: "
                +kibanda.deliveries()+", Rating: "+kibanda.getRating());
        restaurantList.add(kibanda);

        Restaurant macDonald=new MacDonalds();
        restaurantList.add(macDonald);
        System.out.println("Restaurant name: "+macDonald.getName()+", Country: "+macDonald.getCountryOwned()+", do deliveries: "
                +macDonald.deliveries()+", Rating: "+macDonald.getRating());

        Restaurant bigSquare=new BigSquare();
        restaurantList.add(bigSquare);
        System.out.println("Restaurant name: "+bigSquare.getName()+", Country: "+bigSquare.getCountryOwned()+", do deliveries: "
                +bigSquare.deliveries()+", Rating: "+bigSquare.getRating());

//        System.out.println(restaurantList);
    }
}
