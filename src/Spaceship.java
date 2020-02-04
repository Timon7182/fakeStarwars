
public abstract class Spaceship {
	
	private String name;
	private String id;
	private int currentPassenger;
	private final static int MAX_PASS = 60;
	private final static int MAX_SPEED=3000;
	public Spaceship(String name, String id, int currentPassenger) {
		super();
		this.name = name;
		this.id = id;
		this.currentPassenger = currentPassenger;
		
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getCurrentPassenger() {
		return currentPassenger;
	}

	public static int getMaxPass() {
		return MAX_PASS;
	}
	public static int getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public abstract  double speed();

	@Override
	public String toString() {
		return "Spaceship [name=" + name + ", id=" + id + ", currentPassenger=" + currentPassenger + ", Speed()="
				+ speed() + "]";
	}
	
	
	
	
	
	

}
