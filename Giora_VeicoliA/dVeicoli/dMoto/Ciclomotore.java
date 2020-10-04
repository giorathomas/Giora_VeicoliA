package dVeicoli.dMoto;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dMoto.Moto;
import dVeicoli.dComponenti.Ruota;

public class Ciclomotore extends Moto{
	
	/**
	 * Costruttore parametrico
	 * @param camp ruota campione
	 */
	public Ciclomotore(Ruota camp){
		super(new Motore(50,1), camp);
		super.setPosti(1);
	}//Ciclomotore
	
}//Ciclomotore
