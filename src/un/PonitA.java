package un;

public class PonitA extends Point{
	
	public void affiche(){
		initialise(3, 2);
		System.out.println(getX());
		System.out.println(getY());
	}
	
	public static void main(String[] args) {
		PonitA pa = new PonitA();
		pa.affiche();
	}

}
