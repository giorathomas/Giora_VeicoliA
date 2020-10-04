package dVeicoli.dMoto.dSpeciali;
import dVeicoli.dMoto.Moto;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;

public class Scooter3ruote extends Moto{
	
	private int vano;//dimensione vano
	
	/**
	 * Costruttore parametrico
	 * @param m il motore dello Scooter3ruote
	 * @param ra ruota campione anteriore
	 * @param rb ruota campione posteriore
	 * @param v dimensione vano
	 */
	public Scooter3ruote(Motore m, Ruota ra, Ruota rb, int v){
		super(m, ra);
		super.setPosti(3);
		vano=v;
		Ruota[] temp=new Ruota[3];
		
		for(int i=0; i<2; i++){
			temp[i]=new Ruota(ra);
		}
		temp[2]=new Ruota(rb);
		super.setR(temp);
	}//Scooter3ruote
	
	/**
	 * revisione(cambia la pressione della seconda ruota)
	 * @param p la pressione della seconda ruota desiderata
	 */
	@Override
	public void revisione(double p){
		Ruota[] tempArr=super.getR();
		Ruota tempR=tempArr[1];
		tempR.setPressione(p);
		super.setR(tempArr);
	}//revisione
	
	/**
	 * usura (diminuisce la pressione della ruota desiderata dell'1% se anteriore o aumenta dell'1% se posteriore)
	 * @param ir posizione ruota (1, 2 o 3)
	 */
	 @Override
	public void usura(int ir){
		Ruota[] tempArr=super.getR();
		int index=ir-1;
		
		for(int i=0; i<2; i++){
			if (i==index){
				if(index!=2)
				tempArr[index].setPressione((tempArr[index].getPressione()-(tempArr[index].getPressione()/100)));
			} else {
				tempArr[index].setPressione((tempArr[index].getPressione()+(tempArr[index].getPressione()/100)));
			}
		}
		
		super.setR(tempArr);
	}//usura
	
	/**
	 * getVano
	 * @return dimensione del vano
	 */
	 public int getVano(){
		 return vano;
	 }//getVano
	 
	 /**
	  * setVano
	  * @param v dimensione del vano
	  */
	  public void setVano(int v){
		  vano=v;
	  }//setVano
	
		/**toString
	 * @return lo stato dell'oggetto*/
	@Override
	public String toString(){
		String s="";
		for(int i=0; i<super.getR().length;i++){
			s+=super.getR()[i];
		}//for
		s+="\nPosti: "+super.getPosti()+"\nMotore: "+super.getMotore()+"\nDimensione vano: "+vano;
		return s;
	}//toString

}//Scooter3ruote
