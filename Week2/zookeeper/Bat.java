package Week2.zookeeper;

public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    void fly(){
        System.out.println("SWOOSH! The bat takes to the skies!");
        energyLevel -= 50;
        displayEnergy();
    }

    void eatHumans(){
        System.out.println("The bat enjoys a human snack, it gains 25 energy!");
        energyLevel += 25;
        displayEnergy();
    }

    void attackTown(){
        System.out.println("the bat terrorizes a town, but loses 100 energy!");
        energyLevel -= 100;
        displayEnergy();
    }
}