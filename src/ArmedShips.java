
public abstract class ArmedShips extends Spaceship {

	private int firePower;
	public ArmedShips(String name, String id, int currentPassenger,int firePower) {
		super(name, id, currentPassenger);
		this.firePower = firePower;
		// TODO Auto-generated constructor stub
	}
	public int getFirePower() {
		return firePower;
	}

	public abstract double speed();
	
	

}
