
public class NasumicniBrojevi {
	/**
	 * Da li je broj paran ili neparan
	 * @param n int bilo koji broj
	 * @return true ili false 
	 */
	public static boolean isOdd(int n)
	{
		if(n%2 != 0) 
			return true;
		else 
			return false;
	}
	/**
	 * Odredjivanje nasumicnog broja u odredjenom intervalu
	 * @param poc int pocetak intervala
	 * @param kraj int kraj intervala
	 * @return nasumicni broj
	 */
	public static int randomInInterval(int poc, int kraj)
	{
		int c = (int) (poc+Math.random()*(kraj - poc + 1));
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Unesite pocetak intervala: ");
		int poc = TextIO.getInt();
		System.out.println("Unesite kraj intervala: ");
		int kraj = TextIO.getInt();
		for(int i = 0; i < 5; i++)
		{
			int c = randomInInterval(poc, kraj);
			System.out.print("Generisali smo broj " + c + ",");
			if(isOdd(c) == true) System.out.println(" neparan je.");
			else System.out.println(" paran je.");
		}
	}

}
