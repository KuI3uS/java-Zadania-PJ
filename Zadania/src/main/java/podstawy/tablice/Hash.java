package podstawy.tablice;

import java.util.HashSet;
import java.util.Set;

public class Hash {
    public static void main (String[] args){
        Set<String> meals = new HashSet<> ();

        meals.add ( "Pizza" );
        meals.add ( "burger" );
        meals.add ( "salataka" );
        meals.add ( "Pizza" );

        for (String meal : meals){
            System.out.println (meal);
        }
    }
}
