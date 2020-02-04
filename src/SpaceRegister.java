import java.util.ArrayList;

public class SpaceRegister {
	
	public ArrayList<Spaceship> space ;

	public SpaceRegister() {
		this.space = new ArrayList<>();
	}

	public void registerSpaceship(Spaceship newSpace) {
		space.add(newSpace);
		
	}
	public void printAll() {
		for(int i=0;i<space.size();i++) {
			System.out.println("(SpaceShip) Name : "+space.get(i).getName() + " | | Speed: " + space.get(i).getMaxSpeed());
		}
		
	}

	public ArrayList<Spaceship> getSpace() {
		return space;
	}

	public void setSpace(ArrayList<Spaceship> space) {
		this.space = space;
	}

	
	
}
