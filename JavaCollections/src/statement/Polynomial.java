package statement;
import java.util.*;
import statement.Term;

/**
 * Elyon Olaniran
 * Polynomial class
 */
public class Polynomial {

	/**
	 * ArrayList holding the terms in the polynomial
	 */
	private ArrayList<Term> poly;
	
	/**
	 * Constructor for the Polynomial.
	 * 
	 * Inits the array to hold terms
	 */
	public Polynomial() {
		poly = new ArrayList<Term>();
	}
	
	/**
	 * Insert a new Term into the polynomial
	 * 
	 * Term is automatically placed so that the other terms
	 * are listed in ascending order by exponent.
	 * @param c coefficient of the new term
	 * @param e exponent of the new term
	 */
	public void insert(int c, int e) {
		if (poly.size() != 0) {
			for (int x = 0; x < poly.size(); x++) {
				// finds expnt greater than e to insert behind 
				if (poly.get(x).getExponent() > e) { 
					poly.add(x, new Term(c, e)); // insert at new found location
					return;
				}
			}
		}
		poly.add(new Term(c, e)); // else, add the new term to the end of the list
	}
	
	/**
	 * Delete a term from the polynomial
	 * 
	 * If the term isn't in the list, user is alerted.
	 * @param c coefficient of the term to delete
	 * @param e exponent of the term to delete
	 */
	public void delete(int c, int e) {
		for (int x = poly.size() - 1; x > -1; x--) { // find correct term
			if (poly.get(x).getExponent() == e && 
					poly.get(x).getCoefficient() == c) {
				poly.remove(x);
				return;
			}
		}
		// if the term isn't found, alert the user.
		System.out.println("Term " + new Term(c,e).toString() + " not found.");
	}
	
	/**
	 * Returns Polynomial as a String.
	 * 
	 * @return Polynomial in the form ""4x^3 + x^2..etc"
	 */
	public String toString() {
		String p = "";
		for (int x = 0; x < poly.size(); x++) {
			// handles + or - in front of coefficient
			if (x != 0){
				p += " ";
				if(poly.get(x).getCoefficient() > 0)
					p += "+";
			}
			// add term to string	
			p += poly.get(x).toString();
			
		}
		return p;
	}
	
	/**
	 * Computes & returns the product of all of the terms
	 * 
	 * @return Product of all the terms in the Polynomial as a string
	 */
	public String Product() {
		int e = 0, c= 1;
		for (int x = 0; x < poly.size(); x++) {
			e += poly.get(x).getExponent();
			c *= poly.get(x).getCoefficient();
		}
		return new Term(c,e).toString();
	}
	
	/**
	 * Reverses the order of terms in the polynomial.
	 */
	public String Reverse() {
		int c, e;
		String p = "";
		for (int x = poly.size() - 1; x > -1; x--) {
			if (x != poly.size() - 1) {
				p += " ";
				if(poly.get(x).getCoefficient() > 0)
					p += "+";
			}
			c = poly.get(x).getCoefficient();
			e = poly.get(x).getExponent();
			p += new Term(c,e).toString();
			}
		return p;
	}
	
}
