package statement;

/**
 * Elyon Olaniran
 * term class
 */
public class Term {
	
	
	/**
	 * The coefficient in the term
	 */
	private int coeff;
	/**
	 * The exponent in the term
	 */
	private int exp;
	
	/* Creates a Term object
	 */
	public Term(int c, int e) {
		if (e < 0) { // Cannot have a negative exponent in a term
			System.out.println("Exponent is negative, not creating.");
			return;
		}
		
		if (c == 0) {
			System.out.println("Coefficient is zero, not creating.");
			return;
		}

		coeff = c;
		exp = e;
	}
	
	/**
	 * Returns the coefficient of the current term.
	 * 
	 * return coefficient as an integer
	 */
	public int getCoefficient(){
		return coeff;
	}
	
	/**
	 * Returns the exponent of the current term.
	 * 
	 * @return exponent as an int
	 */
	public int getExponent(){
		return exp;
	}
	
	
	/**
	 * Returns the term object as a string
	 * return string of the Term
	 */
	public String toString(){
		String term = "";
	
		if (coeff != 1) // when coeff is 1, printing it is redundant
			term += (Integer.toString(coeff));
		
		if (exp != 0) { // when exp is 0, x becomes 1, thus not printed
			term += "x";
			
			if (exp > 1) // exponent is greater than one, show it

				term += "^" + Integer.toString(exp);
		}
		
		if (term.equals("")) // when coefficient is 1 & exponent is 0, the term is just 1
			term += "1";

		return term;
	}
}
