package dVeicoli.dAuto.dSpeciali;
import dVeicoli.dAuto.dSpeciali.AutoFurgone;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;

public class PickUp extends AutoFurgone{
	
	private boolean coperto;//carico coperto
	
	/**
	 * Costruttore parametrico
	 * @param m motore del pickup
	 * @param r ruota campione del pickup
	 * @param volCarico volume di carico del pickup
	 * @param attCarico volume di carico attuale del pickup
	 * @param coperto carico coperto
	 */
	public PickUp(Motore m, Ruota r, int volCarico, int attCarico, boolean coperto){
		super(m, r, volCarico, attCarico);
		super.setPosti(2);
		this.coperto=coperto;
		Ruota[] temp=super.getR();
		for(int i=2; i<4; i++){
			temp[i]=new Ruota(temp[i].getDiametro(), temp[i].getPneumatico(), (temp[i].getPressione()+(temp[i].getPressione()/100*10)));
		}
		super.setR(temp);
		
	}//PickUp
	
	/**toString
	 * @return lo stato dell'oggetto*/
	@Override
	public String toString(){
		String s="";
		for(int i=0; i<super.getR().length;i++){
			s+=super.getR()[i];
		}//for
		s+="\nPosti: "+super.getPosti()+"\nMotore: "+super.getMotore()+"\nVolume di carico: "+super.getVolCarico()+"\nCarico attuale: " + super.getAttCarico()+"\nCabinato coperto:"+coperto;
		return s;
	}//toString
	
	/**
	 * getCoperto
	 * @return carico coperto
	 */
	 public boolean getCoperto(){
		 return coperto;
	 }//getCoperto
	 
	 /**
	 * setCoperto
	 * @param coperto carico coperto
	 */
	 public void getCoperto(boolean coperto){
		 this.coperto=coperto;
	 }//setCoperto
	
}//PickUp
