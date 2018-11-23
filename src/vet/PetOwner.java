package vet;

public class PetOwner {
    protected Animal firstPet;
    protected Animal secondPet;

    public PetOwner(Animal firstPet, Animal secondPet) {
        this.firstPet = firstPet;
        this.secondPet = secondPet;
    }

    public void takePetsToVet(Vet vet){
        vet.giveShotTo(firstPet);
        vet.giveShotTo(secondPet);

    }
}
