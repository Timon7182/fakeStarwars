
public class StarDestroyer extends ArmedShips {

	
	private final static int MAX_WEIGHT = 500;
	private final static int MAX_PASS = 10;
	private final static int MAX_SPEED = 300;
	private int currentWeight;
	public StarDestroyer(String name, String id, int currentPassenger,int firePower,int currenctWeight) {
		super(name, id, currentPassenger, firePower);
		
		this.currentWeight = currenctWeight;
		
		// TODO Auto-generated constructor stub
	}
	
	

	


	public static int getMaxWeight() {
		return MAX_WEIGHT;
	}



	public static int getMaxPass() {
		return MAX_PASS;
	}



	public static int getMaxSpeed() {
		return MAX_SPEED;
	}



	public int getCurrentWeight() {
		return currentWeight;
	}



	@Override
	public double speed() {
		return MAX_SPEED - (getCurrentPassenger()/5)-getCurrentWeight();
		
	}

}
