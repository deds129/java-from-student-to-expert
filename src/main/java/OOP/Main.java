package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать программу для обслуживания клиники питомцев.
-Должна быть возможность добавлять клиентов. +
-Указывать какой питомец есть у клиента.+
-Возможность искать по кличке питомца по имени клиента, по имени клиента+
-Редактировать имя клиента, имя питомца. стоит final без его удаления изменить через сеттер нельзя
-Удалять клиента,питомца. то же самое
-Возможность валидации.
 */
public class Main {

    public static void main(String[] args) throws IOException {
		final Clinic clinic=new Clinic();
		System.out.println("=======Welcome to the clinic=======");
		System.out.println("Please choose your operation:\n" +
				"[0]-show clients\n" +
				"[1]-create client\n" +
				"[2]-delete client\n" +
				"[3]-change client name\n" +
				"[4]-search client\n" +
				"[5]-search pet\n"+
				"[6]-exit");
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		clinic.addClient(0,new Client("empty",new Animal("empty")));
		clinic.addClient(1,new Client("empty",new Animal("empty")));
		clinic.addClient(2,new Client("empty",new Animal("empty")));
		clinic.addClient(3,new Client("empty",new Animal("empty")));
		clinic.addClient(4,new Client("empty",new Animal("empty")));
		clinic.addClient(5,new Client("empty",new Animal("empty")));
		clinic.addClient(6,new Client("empty",new Animal("empty")));
		clinic.addClient(7,new Client("empty",new Animal("empty")));
		clinic.addClient(8,new Client("empty",new Animal("empty")));
		clinic.addClient(9,new Client("empty",new Animal("empty")));
		String clientId;
		String petName;
		String petType;
		int position;
		int operationNum=0;
		try {
			while (operationNum !=6) {
				System.out.println("Please choose your operation: ");
				 operationNum =Integer.parseInt(reader.readLine());
				switch (operationNum) {
					case 0:
						clinic.listOfClients();
						break;
					case 1:
						System.out.println("Enter client position, Name,Clients pet name Pet type(Cat,Dog,CatDog)");
						position=Integer.parseInt(reader.readLine());
						clientId=reader.readLine();
						petName=reader.readLine();
						petType=reader.readLine();
						if ("Cat".equals(petType)) {
							clinic.addClient(position, new Client(clientId, new Cat(petName)));
						} else if ("Dog".equals(petType)) {
							clinic.addClient(position, new Client(clientId, new Dog(new Animal(petName))));
						}

						/* else if ("CatDog".equals(petType)) {
							clinic.addClient(position, new Client(clientId,
									new CatDog(new Cat(" "),new Dog(new Animal(petName)))));
						} **/

						else {
							System.out.println("Error!");
							break;
						}

						break;
					case 2:
						System.out.println("Please enter Client position");
						position = Integer.parseInt(reader.readLine());
						clinic.addClient(position,new Client("empty",new Animal("empty")));
						break;
					case 3:

						System.out.println("Please enter Client position");
						position = Integer.parseInt(reader.readLine());
						System.out.println("Please enter Client name");
						clientId=reader.readLine();
						clinic.clientNameChange(position,clientId);
						break;
					case 4:
						System.out.println("Please enter Client name");
						clientId=reader.readLine();
						clinic.findClientByName(clientId);
						break;
					case 5:
						System.out.println("Please enter Pet name");
						petName=reader.readLine();
						clinic.findClientByPetName(petName);


					default:
						System.out.println("Wrong number of operation!");
						break;
				}

			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Wrong input! "+e.getMessage());
		}

		/*

		clinic.addClient(1,new Client("White",new Dog(new Animal("Sparky"))));
		clinic.addClient(4,new Client("White",new Cat("Digy1")));
		clinic.addClient(4,new Client("White",new Cat("Digy1")));

	//clinic.findClientByName("White"); //возвращает массив, но я сделал вывод для наглядности
    //clinic.findClientByPetName("Digy");
    clinic.listOfClients();
   // clinic.clientDel("White");
		//clinic.listOfClients();
clinic.clientNameChange(0,"Brown");
		System.out.println("");
		clinic.listOfClients();


		System.out.println("");
		clinic.listOfClients();


		 */
    }
}
