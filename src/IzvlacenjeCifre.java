
public class IzvlacenjeCifre {
	/**
	 * Odredjivanje zadane cifre u broju
	 * @param n int bilo koji broj
	 * @param red int redni broj cifre
	 * @return zadana cifra
	 */
	public static int VratiCifru(int n, int red)
	{
		int cifra = 0;
		for(int i = 0; i < red; i++)
		{
			cifra = n % 10;
			n /= 10;
		}
		return cifra;
	}
	public static void main(String[] args) {
		System.out.println("Unesite zadani broj: ");
		int broj = TextIO.getInt();
		System.out.println("Unesite redni broj cifre: ");
		int n = TextIO.getInt();
		System.out.println(VratiCifru(broj, n));
	}

}
