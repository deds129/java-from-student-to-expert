package OOP;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog implements Pet{
    private final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    @Override
    public void makeSound() {
        this.pet.makeSound();
                System.out.println("Gav-Gav");
    }

    @Override
    public String getName() {
        return this.pet.getName();
    }
}
