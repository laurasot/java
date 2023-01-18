public class Human {
    int strength = 3;
    int stealth = 3;
    int intelligence = 3;
    int health = 100;
    public void setHealth(int salud){
        health = salud;
    }
    public int getHealth(){
        return health;
    }
    public void setStrength(int fuerza){
        strength = fuerza;
    }
    public int getStrength(){
        return strength;
    }
    
    //metodo en donde un objeto clase humano(atacante) ataca a otro objeto clase humano(victima),
    //el parametro es de tipo Human, pues pertenecen a la clase Human, se aplica el
    //set para modificar el health de la victima, quitandole segun la cantidad de strength
    //que tenga el atacante
    public void attack(Human victima){
        victima.setHealth( victima.getHealth() - getStrength());
        System.out.println(victima.getHealth());
    }
}
