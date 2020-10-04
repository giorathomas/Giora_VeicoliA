package dVeicoli.dMoto;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;
import dVeicoli.Veicolo;

public class Moto extends Veicolo{
	
	/**
	 * Costruttore parametrico
	 * @param m il motore della moto
	 * @param r la ruota campione della moto
	 * */	 
	public Moto(Motore m, Ruota r){
		super(m);
		super.setR(Ruota.nRuote(r,2));
		super.setPosti(2);
	}//Moto
	
	/**
	 * revisione (cambia pressione della prima ruota)
	 * @param p la pressione desiderata
	 */
	public void revisione(double p){
		Ruota[] tempArr=super.getR();
		Ruota tempR=tempArr[0];
		tempR.setPressione(p);
		super.setR(tempArr);
	}//revisione
	
	/**
	 * usura (diminuisce la pressione della ruota desiderata dell'1%)
	 * @param ir posizione ruota (1 o 2)
	 */
	public void usura(int ir){
		Ruota[] tempArr=super.getR();
		int index=ir-1;
		
		for(int i=0; i<2; i++){
			if (i==index){
				tempArr[index].setPressione((tempArr[index].getPressione()-(tempArr[index].getPressione()/100)));
			}
		}
		
		super.setR(tempArr);
	}//usura
	
}//Moto
