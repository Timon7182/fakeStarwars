 
public class Transport extends Spaceship {
	private final static int MAX_SPEED = 300;
	private final static int MAX_PASS = 10;

	public Transport(String name, String id, int currentPassenger) {
		super(name, id, currentPassenger);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double speed() {
		// TODO Auto-generated method stub
		return MAX_SPEED - (getCurrentPassenger()/5);
	}

	


	public static int getMaxSpeed() {
		return MAX_SPEED;
	}



	public static int getMaxPass() {
		return MAX_PASS;
	}



	@Override
	public String toString() {
		return "Transport [speed()=" + speed() + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getCurrentPassenger()=" + getCurrentPassenger() + "]";
	}
	
	

}
