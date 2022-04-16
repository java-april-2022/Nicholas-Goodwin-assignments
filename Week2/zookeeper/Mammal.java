package Week2.zookeeper;

public class Mammal {
    int energyLevel = 100;

    int displayEnergy(){
        System.out.printf("Energy level: %s\n", energyLevel);
        return energyLevel;
    }
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
}
