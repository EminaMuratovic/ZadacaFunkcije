public class Djeljivost {
	/**
	 * Odredjuje da li je parametar a djeljiv sa parametrom b
	 * @param a int bilo koji broj
	 * @param b int bilo koji broj koji je razlicit od nule
	 * @return true ili false
	 */
	static public boolean JeDjeljiv(int a, int b) {
		if (a % b == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int i;
		System.out.println("Unesite zeljeni broj: ");
		int broj = TextIO.getInt();
		for (i = broj; i > 0; i--)
			if (JeDjeljiv(i, 5) == true || JeDjeljiv(i, 7) == true
					|| JeDjeljiv(i, 11) == true)
				System.out.println(i);
	}

}
