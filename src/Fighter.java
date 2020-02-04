
public class Fighter extends ArmedShips{
	
	private final static int MAX_PASS = 10;
	private final static int MAX_SPEED = 300;

	private boolean robot;

	public Fighter(String name, String id, int currentPassenger,int firePower,boolean robot) {
		super(name, id, currentPassenger,firePower);
		
		this.robot=robot;
		
		// TODO Auto-generated constructor stub
	}
	
	

	public static int getMaxPass() {
		return MAX_PASS;
	}



	public static int getMaxSpeed() {
		return MAX_SPEED;
	}




	public boolean isRobot() {
		return robot;
	}



	@Override
	public double speed() {
		if(robot) {
			double a = (MAX_SPEED - (getCurrentPassenger()/5))*1.7;
			if (a<MAX_SPEED) {
				return a;
			}
			else  {
				System.out.println("bigger then max speed");
				
			}
			
		}
		else {
			double a = MAX_SPEED - (getCurrentPassenger()/5);
			
			if (a<MAX_SPEED) {
				return a;
			}
			else  {
				System.out.println("bigger then max speed");
				
			}
		}
		return 0;
		
		
	}
	

}
