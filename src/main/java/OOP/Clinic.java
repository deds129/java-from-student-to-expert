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
    private  List<Client> clients = new ArrayList<Client>(10);

    Clinic() {
        this.clients=new ArrayList<Client>(10);
    }

    /**
     * Добавить клиента
     *
     * @param position Позиция
     * @param client   Клиент
     */
    public void addClient(final int position, final Client client) {
        this.clients.add(position, client);
    }

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
    public void listOfClients() {
        for (int i=0; i < clients.size(); i++) {
            System.out.println(clients.get(i).getId()+" "+clients.get(i).getClientPetsType()+" "+ clients.get(i).getPetName());
        }
    }

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

        public void clientNameChange(final int position,String name){
            for (int i=0; i < clients.size(); i++) {
                if (i==position) {
                    clients.get(i).setId(name);

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



