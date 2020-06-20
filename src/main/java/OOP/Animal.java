package OOP;

public class Animal implements Pet {
    private  String name;

    public Animal( String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say:",this.name));
    }

    @Override
    public String getName() {
        return name;
    }
}
