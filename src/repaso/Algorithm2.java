package repaso;

public class Algorithm2 {
	
	public static void main(String[] args) {
		boolean stop = false;
		String semaphoreState = "green";
		
		crossStreet(semaphoreState);
		
		crossStreet("green");
		crossStreet("yellow");
		crossStreet("red");
		crossStreet("rte45");
		
		System.out.println(stop);
	}
	
	private static void crossStreet(String semaphoreState) {

		if (semaphoreState == "green") {

			System.out.println("crossing the street .......");
		} 

		else if (semaphoreState == "yellow") {

			System.out.println("wait for green .....");
		}

		else if (semaphoreState == "black") {

			System.out.println("contacting with traffic office .....");
		}

		else {

			System.out.println("abandon the task .....");

		}

	}


}