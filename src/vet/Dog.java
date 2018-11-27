package vet;

public class Dog implements WildAnimalPet {
    @Override
    public void makeNoise() {
        System.out.println("Woof!!!");
    }

    @Override
    public void play() {
        System.out.println("Smile");
    }
}
