public class Gorilla  extends Mammal{
    public void throwSomething(String objeto){
        System.out.println("Lanzando " + objeto);
        energyLevel = energyLevel - 5;
    }

    public void eatBananas(){
        System.out.println("Gorilla feliz por comer banana");
        energyLevel = energyLevel + 10;
    }
    public void climb(){
        System.out.println("Gorilla trepa arbol");
        energyLevel = energyLevel - 10;
    }


}
