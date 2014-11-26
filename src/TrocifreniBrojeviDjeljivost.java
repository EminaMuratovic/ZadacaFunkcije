
public class TrocifreniBrojeviDjeljivost {
	/**
	 * Ispisivanje svih trocifrenih brojeva koji su djeljivi sa zadanim brojem
	 * @param n int bilo koji broj
	 */
	public static void Djeljivo(int n)
	{	
	for(int i=100; i<1000; i++)
		if(i%n==0) System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("Unesite broj sa kojim dijelite: ");
		int broj=TextIO.getInt();
		Djeljivo(broj);
	}
}
