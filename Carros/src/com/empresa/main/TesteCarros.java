package com.empresa.main;

import com.empresa.model.Carro;
import com.empresa.model.*;


public class TesteCarros {

	public static void main(String[] args) {
		Carro c1 = new Civic();
	    Ferrari c2 = new Ferrari(500);
	    
	    System.out.println("CIVIC");
	    System.out.println("Aceleração!!");
	    c1.acelerar();
	    System.out.println(c1);
	    c1.acelerar();
	    System.out.println(c1);
	    c1.acelerar();
	    System.out.println(c1);
	    
	    System.out.println("\n");
	    
	    System.out.println("FERRARI");
	    System.out.println("Aceleração!!");
	    c2.ativarTurbo();
	    c2.acelerar();
	    System.out.println(c2);
	    c2.acelerar();
	    System.out.println(c2);
	    c2.acelerar();
	    System.out.println(c2);

	}

}
