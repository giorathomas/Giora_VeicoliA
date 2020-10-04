import dVeicoli.dComponenti.Motore;
import dVeicoli.dMoto.Moto;
import dVeicoli.dMoto.Ciclomotore;
import dVeicoli.dMoto.dSpeciali.Scooter3ruote;
import dVeicoli.dComponenti.Ruota;
import dVeicoli.Veicolo;

public class MotoCicloScoTest{
	
	public static void main(String[] args){
	
	//Test Moto
	System.out.println("Moto 1: ");
	Moto motTest=new Moto(new Motore(1500, 4), new Ruota(15, "Pirelli", 1.5));
	System.out.println(motTest);
	System.out.println("\nMoto 2: ");
	motTest.revisione(2.2);
	System.out.println(motTest);
	System.out.println("\nMoto 3: ");
	motTest.usura(2);
	System.out.println(motTest);
	
	
	//Test Ciclomotore
	System.out.println("\nCiclomotore 1: ");
	Ciclomotore cicTest=new Ciclomotore(new Ruota(15, "Pirelli", 1.5));
	System.out.println(cicTest);
	//metodi revisione e usura gia testati in Moto essendo Ciclomotore una classe figlia di Moto
	
	//Test Scooter3ruote
	System.out.println("\nScooter3ruote 1: ");
	Scooter3ruote testSco3ruote=new Scooter3ruote(new Motore(1500, 4), new Ruota(15, "Pirelli", 1.5), new Ruota(18, "Pirelli", 1.9), 30);
	System.out.println(testSco3ruote);
	System.out.println("\nScooter3ruote 2: ");
	testSco3ruote.revisione(3.1);
	System.out.println(testSco3ruote);
	System.out.println("\nScooter3ruote 3: ");
	testSco3ruote.usura(3);
	System.out.println(testSco3ruote);
	System.out.println("\nScooter3ruote 4: ");
	testSco3ruote.setVano(100);
	System.out.println(testSco3ruote.getVano());
	
}
	}
