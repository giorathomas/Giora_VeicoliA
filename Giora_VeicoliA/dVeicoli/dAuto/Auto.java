package dVeicoli.dAuto;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;
import dVeicoli.Veicolo;

public class Auto extends Veicolo{
	
	/**
	 * Costruttore parametrico
	 * @param m motore dell'auto
	 * @param r ruota campione dell'auto
	 * @param posti numero posti dell'auto
	 */
	public Auto(Motore m, Ruota r, int posti){
		super(m);
		super.setPosti(posti);
		super.setR(Ruota.nRuote(r,4));
	}//Auto
	
	/**
	 * revisione (cambia pressione di tutte le ruote)
	 * @param p la pressione desiderata
	 */
	public void revisione(double p){
		for(Ruota r:super.getR()){
			r.setPressione(p);
		}
	}//revisione
	
	/**
	 * usura (diminuisce la pressione della ruota desiderata dell'1%)
	 * @param ir posizione ruota (1, 2, 3 o 4)
	 */
	public void usura(int ir){
		Ruota[] tempArr=super.getR();
		int index=ir-1;
		
		for(int i=0; i<4; i++){
			if (i==index){
				tempArr[index].setPressione((tempArr[index].getPressione()-(tempArr[index].getPressione()/100)));
			}
		}
		
		super.setR(tempArr);
	}//usura
	
	
}//Auto
