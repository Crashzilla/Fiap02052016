package Aula02052016;

import java.awt.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	
	public static void main (String[] args){
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList <Integer> linkedList = new LinkedList<>();
		LocalDateTime inicio = LocalDateTime.now();
		int tamanho = 1_000_000;
		
		
		for (int i=0; i<tamanho; i++){
			arrayList.add(i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		
		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("tempo de inserção Array: "+tempoInsercao);
		
		inicio = LocalDateTime.now();
		
		for (int i=0; i<tamanho; i++){
			
				linkedList.add(1);
		}
		
		fim = LocalDateTime.now();
		
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("tempo de inserção Linked: "+tempoInsercao);
		
		inicio = LocalDateTime.now();
		
		arrayList.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("tempo de busca Array: "+tempoInsercao);
		
		inicio = LocalDateTime.now();
		
		linkedList.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("tempo de busca Linked: "+tempoInsercao);
		
	}
}
