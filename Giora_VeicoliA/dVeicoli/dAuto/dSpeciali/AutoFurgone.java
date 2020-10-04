package dVeicoli.dAuto.dSpeciali;
import dVeicoli.dAuto.Auto;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;

public class AutoFurgone extends Auto{
	
	private int volCarico; //volume di carico del furgone
	private int attCarico; //volume di carico attuale del furgone
	
	/**
	 * Costruttore parametrico
	 * @param m motore del furgone
	 * @param r ruota campione del furgone
	 * @param volCarico volume di carico del furgone
	 * @param attCarico volume di carico attuale del furgone
	 */
	public AutoFurgone(Motore m, Ruota r, int volCarico, int attCarico){
		super(m, r, 4);
		this.volCarico=volCarico;
		this.attCarico=attCarico;
	}//AutoFurgone
	
	/**toString
	 * @return lo stato dell'oggetto*/
	@Override
	public String toString(){
		String s="";
		for(int i=0; i<super.getR().length;i++){
			s+=super.getR()[i];
		}//for
		s+="\nPosti: "+super.getPosti()+"\nMotore: "+super.getMotore()+"\nVolume di carico: "+volCarico+"\nCarico attuale: " + attCarico;
		return s;
	}//toString
	
	/**
	 * usura (diminuisce la pressione della ruota desiderata dell'1% se anteriore o aumenta dell'1% se posteriore)
	 * @param ir posizione ruota (1, 2, 3 o 4)
	 */
	 @Override
	public void usura(int ir){
		Ruota[] tempArr=super.getR();
		int index=ir-1;
		
		for(int i=0; i<4; i++){
			if (i==index){
				if(index==0 || index==1)
				tempArr[index].setPressione((tempArr[index].getPressione()-(tempArr[index].getPressione()/100)));
			} else if (index==2 || index==3) {
				tempArr[index].setPressione((tempArr[index].getPressione()+(tempArr[index].getPressione()/100)));
			}
		}
		
		super.setR(tempArr);
	}//usura
	
	/**
	 * aggiungi (aggiunge carico al parametro: se possibile torna true, altrimenti false)
	 * @param carico da aggiungere
	 */
	public boolean aggiungi(int carico){
		if((volCarico-attCarico)>=carico){
			attCarico+=carico;
			return true;
		} else return false;
	}//aggiungi
	
	/**
	 * setAttCarico
	 * @param attCarico carico attuale furgone
	 */
	public void setAttCarico(int attCarico){
		this.attCarico=attCarico;
	} //setAttCarico
	
	/**
	 * setVolCarico
	 * @param volCarico volume carico furgone
	 */
	public void setVolCarico(int volCarico){
		this.volCarico=volCarico;
	} //setvolCarico
	
	/**
	 * getAttCarico
	 * @return carico attuale furgone
	 */
	public int getAttCarico(){
		return attCarico;
	} //getAttCarico
	
	/**
	 * getVolCarico
	 * @return volume carico furgone
	 */
	public int getVolCarico(){
		return volCarico;
	} //getvolCarico
	
}//AutoFurgone
