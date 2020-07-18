package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс клиента
 * @author deds
 * @since 8.05.2020
 */
public class Clinic {
    /*
    список клиентов
     */
    private  List<Client> clients = new ArrayList<Client>();

    Clinic() {
        this.clients=new ArrayList<Client>();
    }

    /**
     * Добавить клиента
     *
     * @param position Позиция
     * @param client   Клиент
     */

    //добавление клиента
    public void addClient(final int position, final Client client) {
        this.clients.add(position, client);
    }
    //список клиентов
    private final List<Client> findClients=new ArrayList<Client>();
    public List<Client> findClientByName(final String name) {
        //можно подругому
        for (int i=0; i < clients.size(); i++) {
            if ((clients.get(i).getId()).equals(name)) {
                findClients.add(clients.get(i));
                System.out.println(clients.get(i).getId() + " "+clients.get(i).getClientPetsType()+" " + clients.get(i).getPetName());
            }
        }
        return findClients;
    }
    //список клинетов
    public void listOfClients() {
        for (int i=0; i < clients.size(); i++) {
            System.out.println(clients.get(i).getId()+" "+clients.get(i).getClientPetsType()+" "+ clients.get(i).getPetName());
        }
    }
    //поиск клиентов по имени
        public List<Client> findClientByPetName (final String name){
            for (int i=0; i < clients.size(); i++) {
                if ((clients.get(i).getPetName()).equals(name)) {
                    findClients.add(clients.get(i));
                    System.out.println(clients.get(i).getId() + " "+clients.get(i).getClientPetsType()+" " +
                            clients.get(i).getPetName());
                }
                else{
                    System.out.println("Client not found");
                }
            }
            return findClients;
        }
        //изменение имени клиента
        public List<Client> clientNameChange(final int position, String name){
            for (int i=0; i < clients.size(); i++) {
                if (i==position) {
                    clients.get(i).setId(name);
                }
            }
            return this.clients;
        }

    //удаление клиента
    public List<Client> clientDelbyPosition(final int position) {
        clients.remove(position);
        return this.clients;
        }

 
    }



