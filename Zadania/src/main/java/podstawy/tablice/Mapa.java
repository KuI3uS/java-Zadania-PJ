package podstawy.tablice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {
    public static void main (String[] args){
        Map<String, String> nameToMeal = new HashMap<> ();

        nameToMeal.put ( "Mariusz", "Pizza" );
        nameToMeal.put ( "Tadeusz", "Burger" );
        nameToMeal.put ( "Kamil", "Salatke" );

        nameToMeal.put ( "Mariusz", "Pesto" );//zawsze ostatnia wartość jest brana

        System.out.println (nameToMeal.containsKey ( "Mariusz" ));
        System.out.println (nameToMeal.containsValue ( "Pizza" ));

        Set<String> keys = nameToMeal.keySet ();
        for(String  key : keys){
            System.out.println (key);
        }
    }
}
