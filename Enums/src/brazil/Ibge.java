package brazil;

public class Ibge {

	public static void main(String[] args) {
		
		for(States e: States.values()) {
			System.out.println(e.getAcronym() + "-" + e.getName() + "|" + e.getNameUpperCase() + "|" + e.getIbge());
		}
		
		States north = States.CEARA;
		
		System.out.println(north.getAcronym() + "-" + north.getName() + "|" + north.getIbge());
		 
	}
}
