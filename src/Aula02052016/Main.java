package Aula02052016;

import java.awt.List;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	
	public static void main (String[] args){
	
		ArrayList<Cliente> ListaCliente = new ArrayList<>();
		LocalDate agore = LocalDate.now()
		
		
		Cliente cliente1 = new Cliente("João", 22, true, Date(2016, 01, 10));
		Cliente cliente2 = new Cliente("Pedro", 65, true, Date(2015, 12, 23));
		Cliente cliente3 = new Cliente("Carlos", 48, true, Date(2011, 01, 29));
		Cliente cliente4 = new Cliente("Paulo", 33, true, Date(2007, 07, 12));
		Cliente cliente5 = new Cliente("André", 62, true, Date(2013, 10, 31));
		
		ListaCliente.add(cliente1);
		ListaCliente.add(cliente2);
		ListaCliente.add(cliente3);
		ListaCliente.add(cliente4);
		ListaCliente.add(cliente5);
		
		ListaCliente.stream()
			.filter(c -> c.getPrimeiraCompra())
		
		
		
	}

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
