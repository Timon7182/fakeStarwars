import java.util.Scanner;

public class Controller {

	public void main() {
		start();
		
	}

	Scanner scr = new Scanner(System.in);
	private void start() {
	
		String choise ;
		String choise2;
		SpaceRegister space = new SpaceRegister();
		TransportRegister trans = new TransportRegister();
		FighterRegister fighter = new FighterRegister();
		
		do{
			choise = "";
			System.out.println("T/S/F/N Transport/SpaceShip/Fighter/None");
			while (choise.isEmpty()) {
			choise = scr.next();
				
			}
			switch (choise) {
			case "T":
				System.out.println("Name for Transport ");
				
				String name = scr.next();
				System.out.println("Number of passengers  ");
				int p = scr.nextInt();
				System.out.println("id of Transport");
				String id = scr.next();
				
				trans.registerTransport(new Transport(name, id, p));
				
				
				break;

			case "S":
				System.out.println("Name for SpaceShip ");
				String name1 = scr.next();
				System.out.println("Number of passengers  ");
				int p1 = scr.nextInt();
				System.out.println("Id for SpaceShip ");
				String id1 = scr.next();
				
				System.out.println("Fire Power of  SpaceShip ");
				int firePower= scr.nextInt();
				System.out.println("Weight of SpaceShip ");
				int weight = scr.nextInt();
				space.registerSpaceship(new StarDestroyer(name1, id1, p1, firePower, weight));
				
				break;
			case "F":
				System.out.println("Name of Fighter: ");
				String name2 = scr.next();
				System.out.println("Number of passengers  ");
				int p2 = scr.nextInt();
				System.out.println("Id for SpaceShip ");
				String id2 = scr.next();
				
				System.out.println("Fire Power of  SpaceShip ");
				int firePower2= scr.nextInt();
				System.out.println("Is this fighter robot or not (false or true) ");
				String word = scr.next();
				boolean result = false;
				if(word=="false") {
					result= false;
					
				}else {
					 result = true;
				}
				fighter.registerFighter(new Fighter(name2,id2,p2,firePower2,result));
				break;
			}
		}
		while(choise.compareTo("N")!=0);
		
		
		do {choise2="";
		
		System.out.println("Print S/T/F/N ? ");
		
		while (choise2.isEmpty()) {
			choise2 = scr.next();
				
			}
		
		switch(choise2) {
		case "S":
			space.printAll();
			break;
		case "T":
			trans.printAll();
			break;
		case "F":
			fighter.printAll();
			break;
		}
		}while(choise2.compareTo("N")!=0);
		System.out.println("By");
		
	}
		

}
