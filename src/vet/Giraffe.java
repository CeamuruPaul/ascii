package vet;

public class Giraffe implements WildAnimalPet{

    @Override
    public void makeNoise() {
        System.out.println("Gif!!!");
    }

    public void sleep(){
        System.out.println("zzzzz");
    }

    @Override
    public void play() {
        System.out.println("Head down");
    }
}
