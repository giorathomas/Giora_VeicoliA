package dVeicoli;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;

public abstract class Veicolo{
	private Motore motore;
	private Ruota[] r;
	private int posti;
	
	/**costruttore parametrico
	 * @param m il motore*/
	protected Veicolo(Motore m){
		motore=new Motore(m);
	}//Veicolo
	
	/**toString
	 * @return lo stato dell'oggetto*/
	public String toString(){
		String s="";
		for(int i=0; i<r.length;i++){
			s+=r[i];
		}//for
		s+="\nPosti: "+posti+"\nMotore: "+motore;
		return s;
	}//toString
	
	/**setR
	 * @param ra array di ruote*/
	public void setR(Ruota[] ra){
		r=new Ruota[ra.length];
		for(int i=0;i<ra.length;i++)
			r[i]=new Ruota(ra[i]);
	}//setR
	
		/**getR
	 * @return array di ruote*/
	public Ruota[] getR(){
		return r;
	}//getR
	
			/**getMotore
	 * @return motore*/
	public Motore getMotore(){
		return motore;
	}//getMotore
	
	/**getPosti
	 * @return numero di posti*/
	public int getPosti(){
		return posti;
	}//getPosti
	
		/**setPosti
	 * @param np numero di posti*/
	public void setPosti(int np){
		posti=np;
	}//setPosti
	
}//Veicolo
