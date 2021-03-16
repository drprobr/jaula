package br.unip.brasilia;

/*
	OBJETIVO: Apresentar o básico de Collections 
	ENTRADA: N/A
	SAÍDA: Variável de acordo com a Collection
*/

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.HashMap;
//import java.util.LinkedHashMap;

public class Executora {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		//Imaginem o CRUD
		
		al.add("Adalberto");
		al.add("Beatriz");
		al.add("Carlos");
		al.add("Diego");
		al.add("Zoraia");
		
		System.out.println("Elementos do ArrayList:");
		System.out.println(al);
		
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Carlos");
		ll.add("Adalberto");
		ll.add("Beatriz");
		ll.add("Zoraia");
		ll.add("Diego");
		
		System.out.println("Elementos do LinkedList:");
		System.out.println(ll);

	}

}
