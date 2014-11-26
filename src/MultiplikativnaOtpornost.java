
public class MultiplikativnaOtpornost {
	/**
	 * Odredjuje kolika je multiplikativna otpornost nekog broja
	 * @param n int bilo koji broj
	 * @return broj multiplikativne otpornosti
	 */
	public static int MultOtpornost(int n)
	{
		int proizvod = 1;
		int k = 0;
		while (n > 9) {
			proizvod=1;
			
			while (n > 0)
			{
				proizvod = proizvod * (n % 10);
				n /= 10;
			}
			n = proizvod;
			k++;
			
		}
		return k;
	}
	public static void main(String[] args) {	
		System.out.println("Unesite pocetak intervala: ");
		int poc = TextIO.getInt();
		System.out.println("Unesite kraj intervala: ");
		int kraj = TextIO.getInt();
		System.out.println("Unesite broj multiplikativnosti: ");
		int k = TextIO.getInt();
		for (int i = poc; i <= kraj; i++)
		{
			if (MultOtpornost(i) == k)
				System.out.println(i);
		}
		
	}
}