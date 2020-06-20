package OOP;

/**
 * Класс клиента
 * @author deds
 * @since 8.05.2020
 */
public class Client {
    private String id;
    private  Pet pet;


    public String getPetName() {
        return pet.getName();
    }

    public String getClientPetsType(){ return pet.getClass().getSimpleName();}

    public String getId() {
        return id;
    }

    public Client(String id,Pet pet) {
        this.id=id;
        this.pet = pet;
    }

    public void setId(String id){
        this.id=id;
    }



}
