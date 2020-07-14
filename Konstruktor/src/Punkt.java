
	public class Punkt {
	     int x;
	     int y;
	 
	     public Punkt(){ }
	 
	     public Punkt(int a, int b){
	         x = a;
	         y = b;
	     }
	 
	     public Punkt(Punkt pkt){
	         x = pkt.x;
	         y = pkt.y;
	     }
	 
	public static void main(String[] args) {
		Punkt punkt1 = new Punkt(10, 15);
 		System.out.println("Wspó³rzêdne 1 to: ");
 		System.out.println("x1: "+punkt1.x);
 		System.out.println("y2: "+punkt1.y);
 
 		Punkt punkt2 = new Punkt(punkt1);
 		System.out.println("Wspó³rzêdne 2 to: ");
 		System.out.println("x2: "+punkt2.x*2);
 		System.out.println("y2: "+punkt2.y*2);
	}}


