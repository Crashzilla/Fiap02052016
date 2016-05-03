package Aula02052016;

import java.util.ArrayList;

public class Grupo<T> {
	
	ArrayList elementos;
	
	public Grupo(){
		elementos = new ArrayList<T>();
	}
	
	public void add(T obj){
		elementos.add(obj);
	}
	
	public void remove(T obj){
		elementos.remove(obj);
	}

}
