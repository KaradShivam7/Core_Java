package iterator;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

	
	    public static void main(String[] args) {
	        Vector<String> names = new Vector<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        Enumeration<String> e = names.elements();

	        while (e.hasMoreElements()) {
	            String name = e.nextElement();
	            System.out.println(name);
	        }
	    }
	}

