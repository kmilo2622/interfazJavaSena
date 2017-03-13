
import app.Controllers.Controller;

public class Application {
	
	public static Controller control;

	public static void main(String[] args) {
		
		Controller.incio();
		
		control = new Controller();
		control.setLaptopValues1();
	}

}
