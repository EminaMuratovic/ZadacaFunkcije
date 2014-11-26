
public class PonavljanjeUStringu {
	/**
	 * Provjerava da li u stringu ima jednakih karaktera
	 * @param a String bilo koji string
	 * @return true ili false
	 */
	public static boolean JednakiZnakovi(String a)
	{
		int brojac=0;
		for(int i=0; i< a.length(); i++)
		{
			for(int j=i+1; j<a.length(); j++)
			{
				if(a.charAt(i)==a.charAt(j)) brojac ++;
			}
		}
		if(brojac>0) return true;
		else return false;
	}
	public static void main(String[] args) {
		String str;
		System.out.println("Unesite zeljeni string: ");
		str=TextIO.getlnString();
		System.out.println("Da li ovaj string ima jednakih karaktera? " + JednakiZnakovi(str));
	}

}
