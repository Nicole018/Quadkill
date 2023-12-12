package quadrakill;
import java.util.*;
public class RunQuad {

	  public static void main(String[] args) {
	    Square square = new Square();
	    Rectangle rectangle = new Rectangle();
	    Scanner scn = new Scanner(System.in);
	    
	    while(true) {
	    System.out.println("Press R for Rectangle or S for Square: ");
	    String shape = scn.next();
	    
	    if(shape.equalsIgnoreCase("S")){
	      System.out.println("A Square: ");
	      square.showDescription();
	    }
	    else if(shape.equalsIgnoreCase("R")) {
	      System.out.println("A Rectangle: ");
	      rectangle.showDescription();
	    }
	    else {
	      System.out.println("Wrong Input!!");
	      System.exit(0);
	    }
	    }
	  }

	}
}
