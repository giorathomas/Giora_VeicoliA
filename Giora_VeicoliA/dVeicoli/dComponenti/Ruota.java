package dVeicoli.dComponenti;
//Ruota.java

public class Ruota {
	private final double diametro;
	private String pneumatico;
	private double pressione;
	
	/**
	 *@param dia diametro ruota
	 *@param pneu tipo di pneumatico
	 *@param press pressione della ruota*/
	public Ruota(double dia, String pneu, double press){
		diametro=dia;
		pneumatico=pneu;
		pressione=press;
	}//Ruota
	
	
	/** mostra lo stato dell'oggetto
	 *@return stringa con lo stato dell'oggetto*/
	public String toString(){
		return "Diametro (in pollici): "+diametro+"\nTipo pneumatico: "+pneumatico+"\nPressione (in bar): "+pressione;
	}//toString
	
	/**
	 *@return diametro ruota*/
	public double getDiametro(){
		return diametro;
	}//getDiametro
	
	/**
	 *@return tipo pneumatico*/
	public String getPneumatico(){
		return pneumatico;
	}//getPneumatico
	
	/**
	 *@return pressione ruota*/
	public double getPressione(){
		return pressione;
	}//getPressione
	
	/**
	 *@param attPneu attuale tipo di pneumatico*/
	public void setPneumatico(String attPneu){
		pneumatico=attPneu;
	}//setPneumatico
	
	/**
	 *@param attPress attuale pressione ruota*/
	public void setPressione(double attPress){
		pressione=attPress;
	}//getPressione
	
	/**
	 *costruttore di copia
	 *@param ruota1 ruota
	*/
	public Ruota(Ruota ruota1){
		this(ruota1.diametro, ruota1.pneumatico, ruota1.pressione);
	}//Ruota
	
	/**
	 *metodo di classe che ritorna un array di ruote tutte uguali
	 *@param ruota2 modello della ruota di riferimento
	 *@param num numero di ruote contenute nell'array
	*/
	public static Ruota[] nRuote(Ruota ruota2, int num){
		Ruota[] temp = new Ruota[num];
		for(int i=0;i<num;i++){
			temp[i] = new Ruota(ruota2);
		}//for
		return temp;
	}//nRuote
	
	/** ritorna true se le due ruote sono dello stesso tipo cioè se 
	 * hanno lo stesso nome e lo stesso diametro, false altrimenti
	 *@param due seconda ruota
	 *@return esito del confronto*/
	public boolean stessoTipo(Ruota due){
		return (diametro==due.diametro) && (pneumatico.equals(due.pneumatico));
	}//stessoTipo
		
}//Ruota
