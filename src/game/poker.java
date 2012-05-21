package game;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author msk && diablos && Mazzi & Michal Moraczewski
 */
public class poker {
    public static String[] karty = {"A1", "K1", "Q1", "J1", "101", "91","A2", "K2", "Q2", "J2", "102", "92","A3", "K3", "Q3", "J3", "103", "93","A4", "K4", "Q4", "J4", "104", "94"};           
    private static ArrayList<String> lista = new ArrayList<String>(24);
    String[] uklad = new String[5];
    poker() {
        lista.addAll(Arrays.asList(karty));
    }
    public String[] losuj() {
        for (int i = 0; i < 5; i++) {           
            double rando = Math.random()*(lista.size());
            int ba = (int) rando;
            uklad[i] = lista.get(ba);
            lista.remove(ba);
                }
        return uklad;
    }
   
}
