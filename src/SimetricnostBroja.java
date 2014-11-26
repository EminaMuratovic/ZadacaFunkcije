

public class SimetricnostBroja {
	/**
	 * Provjerava da li je broj simetrican, isti i sa jedne i sa druge strane
	 * @param n int bilo koji broj
	 * @return true ili false
	 */
	public static boolean Simetricnost(int n)
	{
		int a=n;
		int cifra=0;
		int k=1;
		int b=0;
		while(n!=0)
		{
			cifra=cifra + n%10*k;
			n=n/10;
			k*=10;
		}
		while(cifra!=0)
		{
			b=b+cifra%10*k;
			cifra=cifra/10;
			k/=10;
		}
		b/=10;
		if(a==b) return true;
		else return false;
	}
	public static void main(String[] args) {
		int broj;
		do{
			System.out.println("Unesite zeljeni broj: ");
			broj=TextIO.getInt();
			if (broj==0) return;
			System.out.println(Simetricnost(broj));
		} while (broj!=0);
}

}
