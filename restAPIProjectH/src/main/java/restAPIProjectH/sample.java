package restAPIProjectH;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 abstract class car{

public void accelerate() {

	
	   
		  
	      System.out.println("Do something to accelerate");
	   }
	
	   public void applyBrakes() {
	      System.out.println("Do something to apply brakes");
	   }
	   public abstract void changeGears();
	}
	

	class Alto extends car {
	   public void changeGears() {
	      System.out.println("Implement changeGears() method for Alto Car");
	   }
	}
	class Santro extends car {
	   public void changeGears() {
	      System.out.println("Implement changeGears() method for Santro Car");
}
	}
