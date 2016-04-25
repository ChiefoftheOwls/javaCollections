package Test;

import statement.*;
import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Polynomial P1 = new Polynomial(), P2 = new Polynomial();
		BufferedReader br;
		String line;
		Scanner scanner, s;
		int c, e;
		try {
			br= new BufferedReader(new FileReader("resources/inputfile"));
			line = br.readLine();
			System.out.println("Line read: " + line);
			scanner = new Scanner(line);
			s = scanner.useDelimiter(";");
			
			System.out.println("Inserting terms into " + s.next() + "\n");
			while (s.hasNextInt()) {
				c = s.nextInt();
				e = s.nextInt();
				P1.insert(c, e);
				System.out.println("Adding " + new Term(c,e).toString() + " to P1." +
				"\nCurrent P1: " + P1.toString()+ "\n");
			}
			s.close();
			
			System.out.println("Final P1: " + P1.toString());
			System.out.println("Reversed P1: " + P1.Reverse());
			System.out.println("Product P1: " + P1.Product());
			System.out.println();
			
			line = br.readLine();
			System.out.println("Line read: " + line);
			scanner = new Scanner(line);
			s = scanner.useDelimiter(";");
			
			System.out.println("Inserting terms into " + s.next()+ "\n");
			while (s.hasNextInt()) {
				c = s.nextInt();
				e = s.nextInt();
				P2.insert(c, e);
				System.out.println("Adding " + new Term(c,e).toString() + " to P2." +
				"\nCurrent P2: " + P2.toString()+ "\n");
				
			}
			
			s.close();
			
			System.out.println("Final P2: " + P2.toString());
			System.out.println("Reversed P2: " + P2.Reverse());
			System.out.println("Product P2: " + P2.Product());
			System.out.println();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println("Deleting 5x^3 from P1");
		P1.delete(5, 3);
		System.out.println("P1: " + P1.toString());
		System.out.println();
		
		System.out.println("Deleting -2x^2 from P2");
		P2.delete(-2, 2);
		System.out.println("P2: " + P2.toString());
		System.out.println();
		
		System.out.println("Deleting 6 from P1(not in list)");
		P1.delete(6, 0);
		System.out.println("P1: " + P1.toString());
		System.out.println();
		
		System.out.println("Deleting 6 from P2 (not in list)");
		P2.delete(6, 0);
		System.out.println("P2: " + P2.toString());
		System.out.println();
		
		System.out.println("Inserting 9x into P1 (repeat exponent)");
		P1.insert(9, 1);
		System.out.println("P1: " + P1.toString());
		System.out.println();
		
		System.out.println("Inserting 9x into P2 (repeat exponent)");
		P2.insert(9, 1);
		System.out.println("P2: " + P2.toString());
		System.out.println();
	}

}