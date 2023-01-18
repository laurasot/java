import java.util.Random;

public class PrimerPrograma {

    public static void main(String[] args) {
        Presentacion( "laura", 20, "Puerto Montt");
        aleatorio();
    }
    public static void Presentacion(String nombre, int edad, String ciudad) {
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años.");
        System.out.println("La ciudad en la que vivo es " + ciudad);
    }
    public static void aleatorio(){
        Random rand = new Random();
        int oroGanado = rand.nextInt(6)+ 5;
        System.out.println(oroGanado);
    }
}
