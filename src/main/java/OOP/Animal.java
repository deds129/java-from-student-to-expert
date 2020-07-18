package OOP;
/*
для дальнейшего расширения
 */
public class Animal implements Pet {
    private  String name;

    public Animal( String name) {
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say:",this.name));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void nameChange(String name) {
        this.name = name;
    }
}
