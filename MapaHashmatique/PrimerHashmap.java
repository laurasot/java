import java.util.HashMap;
import java.util.Set;

public class PrimerHashmap {
    String hashMap( String cancionConComillas){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Wake Up Alone", "I stay up, clean the house, at least I'm not drinking"); 
        trackList.put("In My Bed", "Every thing is slowing down River of no return"); 
        trackList.put("Buenos Aires", "Me empieza a molestar que haga frío en la ciudad");
        trackList.put("Rue Des Cascades", "musiquita de fondo");

        //primera forma de obtener el valor de la clave requerida
        //el bucle compara si cada key es igual a la key que nosotros le damos en el input, que en este caso es cancionConcomillas, a traves
        //del metodo .equals, ya que la forma de comparar dos string correctamente es asi, no con los ==, esto ultimo solo se usa para comparar
        //numeros.
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            if(cancionConComillas.equals(key)){
                //en caso de que la condicion es true, se imprime la key (linea 20), y el value (linea 21)
                System.out.println(key);
                System.out.println( trackList.get(key));
            } 
        }

        //segunda forma de obtener el valor
        System.out.println("----------------------");
        String name = trackList.get(cancionConComillas);
        System.out.println(name);
        return name;
    }


}
