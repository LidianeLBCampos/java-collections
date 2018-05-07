package set_interface;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Provincias {

	public static void main(String[] args) {
		String[] prov = {"Girona", "Barcelona", "Tarragona"};
		
		Collection<String> provCol =Arrays.asList(prov);
	
		Set<String> conjunto;
		
		conjunto= new TreeSet<>(provCol);
		conjunto.forEach(System.out::println);
		
		System.out.println("*********************************************************");
		
		conjunto = new LinkedHashSet<>(provCol);
		conjunto.forEach(System.out::println);
		
		System.out.println("*********************************************************");
		
		conjunto = new HashSet<>(provCol);
		conjunto.forEach(System.out::println);
	}

}
