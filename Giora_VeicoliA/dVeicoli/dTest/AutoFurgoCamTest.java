import dVeicoli.dAuto.Auto;
import dVeicoli.dAuto.dSpeciali.AutoFurgone;
import dVeicoli.dAuto.dSpeciali.PickUp;
import dVeicoli.dComponenti.Motore;
import dVeicoli.dComponenti.Ruota;
import dVeicoli.Veicolo;

public class AutoFurgoCamTest{
	
	public static void main(String[] args){
		
		//test Auto
		Auto testAuto=new Auto(new Motore(1600,6), new Ruota(22, "Michelin", 2.3), 5);
		System.out.println("Auto 1:");
		System.out.println(testAuto);
		System.out.println("\nAuto 2:");
		testAuto.revisione(3);
		System.out.println(testAuto);
		System.out.println("\nAuto 3:");
		testAuto.usura(4);
		System.out.println(testAuto);
		
		//test AutoFurgone
		AutoFurgone testFurgone=new AutoFurgone(new Motore(3000,8),new Ruota(30, "Pirelli", 3.5), 10000, 3000);
		System.out.println("AutoFurgone 1:");
		System.out.println(testFurgone);	
		System.out.println("\nAutoFurgone 2:");
		testFurgone.usura(4);
		System.out.println(testFurgone);
		//metodo revisione per AutoFurgone gia testato in Auto essendo AutoFurgone figlia di Auto
		System.out.println("\nAutoFurgone 3:");
		System.out.println(testFurgone.aggiungi(7001));
		System.out.println(testFurgone);
		
		//test PickUp
		System.out.println("PickUp 1:");
		PickUp testPickUp=new PickUp(new Motore(3000,8),new Ruota(30, "Pirelli", 3.5), 10000, 3000, true);
		System.out.println(testPickUp);
		//metodo revisione, usura e aggiungi per PickUp gia testato in Auto e AutoFurgone essendo PickUp figlia di AutoFurgone
		
	}//main
	
}//AutoFurgoCamTest
