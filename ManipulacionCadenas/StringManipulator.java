public class StringManipulator {
    public void trimAndConcat(String palabra1, String palabra2){
        String PrimeraPalabra = palabra1.trim();
        String SegundaPalabra = palabra2.trim();
        System.out.println(PrimeraPalabra + SegundaPalabra);
    }

    int getIndexOrNull(String palabra, String letraBuscar){
        int indice = 0;
        if( palabra.indexOf(letraBuscar) > -1){
            indice = palabra.indexOf(letraBuscar);
        }
        else{
            indice = -1;
        }
        return indice;
    }

    String concatSubstring(String cadenaini, int indexini, int indexfinal, String cadenafinal){
        String cadena;
        cadena = cadenaini.substring(indexini, indexfinal) + cadenafinal;
        return cadena;
    }
}
