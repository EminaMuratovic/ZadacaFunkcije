
public class Stepenovanje {
	/**
	 * Racunanje stepena zadanog broja
	 * @param broj int bilo koji broj
	 * @param n int bilo koji broj
	 * @return stepen zadanog broja
	 */
	static public int pow(int broj, int n)
	{
		int cifra=1;
		for(int i=1; i<=n; i++)
			cifra*=broj;
		return cifra;
	}
	public static void main(String[] args) {
		System.out.println("Unesite broj: ");
		int broj=TextIO.getInt();
		System.out.println("Unesite stepen: ");
		int n=TextIO.getInt();
		System.out.println(pow(broj, n));
	}

}
