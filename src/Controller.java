import java.util.Scanner;

public class Controller {

	public void main() {
		start();
		
	}

	Scanner scr = new Scanner(System.in);
	private void start() {
	
		String choise ;
		SpaceRegister space = new SpaceRegister();
		
		do{
			choise = "";
			System.out.println("T/S/N Transport/SpaceShip/None");
			while (choise.isEmpty()) {
			choise = scr.next();
				
			}
			switch (choise) {
			case "T":
				System.out.println("Name for Transport ");
				
				String name = scr.next();
				System.out.println("Number of passengers max ");
				int p = scr.nextInt();
				System.out.println("id of Transport");
				String id = scr.next();
				
				space.registerSpaceship(new Transport(name, id, p));
				
				
				break;

			case "S":
				System.out.println("Name for SpaceShip ");
				String name1 = scr.next();
				System.out.println("Number of passengers max ");
				int p1 = scr.nextInt();
				System.out.println("Id for SpaceShip ");
				String id1 = scr.next();
				
				System.out.println("Power of  SpaceShip ");
				int firePower= scr.nextInt();
				System.out.println("Weight of SpaceShip ");
				int weight = scr.nextInt();
				space.registerSpaceship(new StarDestroyer(name1, id1, p1, firePower, weight));
				
				break;
				
			}
		}
		while(choise.compareTo("N")!=0);
		
	}
		

}
