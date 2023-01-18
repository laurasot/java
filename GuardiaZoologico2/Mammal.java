public class Mammal {
    int energyLevel = 100;

    public void setEnergyLevel(int nivelEnergia){
        this.energyLevel = nivelEnergia;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }

    int displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;
    }
}
