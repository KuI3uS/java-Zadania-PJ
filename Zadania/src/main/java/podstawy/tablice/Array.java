package podstawy.tablice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main (String[] args){
        List<String> names = new ArrayList<> ();
        names.add ( "Mariusz" );
        names.add ( "Piotrek" );
        names.add ( "Beata" );

//        System.out.println (names.remove ( "Mariusz" ));//usuniecie mariusza
//        System.out.println (names.contains ( "Dominik" )); //sprawdzam czy jest na liscie
//        System.out.println (names.get ( 2 ));
        Collections.sort ( names );

        for (String name : names){
            System.out.println (name);
        }
    }
}
