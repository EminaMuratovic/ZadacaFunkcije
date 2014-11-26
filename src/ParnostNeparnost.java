
public class ParnostNeparnost {
	/**
	 * Izdvaja parne ili neparne cifre iz zadanog broja 
	 * @param n int bilo koji broj
	 * @param parnost true - za parne brojeve; false - za neparne brojeve
	 * @return novi broj 
	 */
	public static int Podbroj(int n, boolean parnost)
	{
		int cifra=0, k=1;
		if(parnost==true)
			do{
				if((n%10)%2==0)
				{
					cifra=cifra+n%10*k;
					k*=10;
				}
				n/=10;
			} while(n!=0);
		else
			do{
				if((n%10)%2!=0)
				{
					cifra=cifra+n%10*k;
					k*=10;
				}
				n/=10;
			} while(n!=0);
		return cifra;
	}
	public static void main(String[] args) {
		int broj;
		boolean a;
		do
		{
			System.out.println("Unesite zeljeni broj: ");
			broj=TextIO.getInt();
			if(broj==0) return;
			System.out.println("Da li zelite izdvojiti parne brojeve? ");
			a=TextIO.getBoolean();
			System.out.println(Podbroj(broj, a));
		} while(broj!=0);

}
}
