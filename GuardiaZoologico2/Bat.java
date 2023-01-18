public class Bat extends Mammal {
    public Bat() {
		super();
		setEnergyLevel(300);
	}
    public void fly(){
        System.out.println("cuac");
        //energyLevel = energyLevel - 50;
        setEnergyLevel(energyLevel - 50);
        System.out.println(energyLevel);
    }

    public void eatHumans(){
        System.out.println("bueno, no importa");
        //energyLevel = energyLevel + 25;
        setEnergyLevel(energyLevel + 25);
    }

    public void attackTown(){
        System.out.println("*sonido de ciudad en llamas*");
        //energyLevel = energyLevel - 100;
        setEnergyLevel(energyLevel - 100);
    }
}
