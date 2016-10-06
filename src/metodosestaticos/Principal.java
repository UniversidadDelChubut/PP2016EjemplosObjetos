package metodosestaticos;

public class Principal {

	public static void main(String[] args) {
		Radio r1,r2,r3,r4;
		r1 = new Radio();
		r2 = new Radio();
		r3 = new Radio();
		r4 = new Radio();
		
		r1.subirVolumen();
		r1.subirVolumen();
		
		r2.subirVolumen(7);
		
		r3.subirVolumen(-8);
		
		r4.subirVolumen(11);
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}
