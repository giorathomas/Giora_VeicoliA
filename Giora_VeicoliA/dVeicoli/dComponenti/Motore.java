package dVeicoli.dComponenti;
//Motore.java


public class Motore {
	private final int cilta;
	private final int numCil;
	
	/**costruttore completo
	 *@param cil cilindrata
	 *@param nc numero cilindri*/
	public Motore(int cil,int nc){
		cilta=cil;
		numCil=nc;
	}//Ruota
	
	/**costruttore di copia
	 *@param m motore*/
	public Motore(Motore m){
		this(m.cilta,m.numCil);
	}
	
	/** mostra lo stato dell'oggetto
	 *@return stringa con lo stato dell'oggetto*/
	public String toString(){
		return "Cilindrata: "+cilta+"\nNumero cilindri: "+numCil;
	}//toString
	
	/**
	 *@return cilindrata motore*/
	public int getCilindrata(){
		return cilta;
	}//getCilindrata
	
	/**
	 *@return numero cilindri*/
	public int getCilidri(){
		return numCil;
	}//getCilidri
	
}//Motore
