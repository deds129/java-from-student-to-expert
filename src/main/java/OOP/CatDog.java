package OOP;

public class CatDog implements Pet{

    private  Pet cat;
    private Pet dog;

    public CatDog(Pet cat, Dog dog) {
        this.cat = cat;
        this.dog =this.dog;
    }

    @Override
    public void makeSound() {
this.cat.makeSound();
this.dog.makeSound();
    }

    @Override
    public String getName() {

        return  String.format("%s%s", this.cat.getName(),
                this.dog.getName());
    }
}
