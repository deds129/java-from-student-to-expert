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
    private final Client[] clients;

    Clinic(final int size) {
        this.clients=new Client[size];

    }

    /**
     * Добавить клиента
     *
     * @param position Позиция
     * @param client   Клиент
     */
    public void addClient(final int position, final Client client) {
        this.clients[position]=client;
    }

    private final List<Client> findClients=new ArrayList<Client>();
    public List<Client> findClientByName(final String name) {
        //можно подругому
        for (int i=0; i < clients.length; i++) {
            if ((clients[i].getId()).equals(name)) {
                findClients.add(clients[i]);
                System.out.println(clients[i].getId() + " "+clients[i].getClientPetsType()+" " + clients[i].getPetName());
            }
        }
        return findClients;
    }
    public void listOfClients() {
        for (int i=0; i < clients.length; i++) {
            System.out.println(clients[i].getId()+" "+clients[i].getClientPetsType()+" "+ clients[i].getPetName());
        }
    }

        public List<Client> findClientByPetName (final String name){
            for (int i=0; i < clients.length; i++) {
                if ((clients[i].getPetName()).equals(name)) {
                    findClients.add(clients[i]);
                    System.out.println(clients[i].getId() + " "+clients[i].getClientPetsType()+" " + clients[i].getPetName());
                }
                else{
                    System.out.println("Client not found");
                }
            }
            return findClients;
        }

        public void clientNameChange(final int position,String name){
            for (int i=0; i < clients.length; i++) {
                if (i==position) {
                    clients[i].setId(name);

                }
            }
        }

/*
    public Client[] clientDelbyPosition(final int position) {
        clients[position].setId("");

        return clients;
        }
        */
 
    }



