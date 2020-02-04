import java.util.ArrayList;

public class SpaceRegister {
	
	public ArrayList<Spaceship> space ;

	public SpaceRegister() {
		this.space = new ArrayList<>();
	}

	public void registerSpaceship(Spaceship newSpace) {
		space.add(newSpace);
		
	}

	
}
