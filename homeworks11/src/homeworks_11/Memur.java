package homeworks_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memur extends Muhasebe{

	public static void main(String [] args) {
		
		Memur memur1 = new Memur();
		memur1.id=memur1.idAtama();
		memur1.isim="Omer";
		memur1.soyİsim ="Bey";
		memur1.adres="Eskisehir";
		memur1.telefon="123456";
		memur1.saatlikUcret=50;
		memur1.statu="supervizor";
		memur1.maas=memur1.maasHesapla(memur1.saatlikUcret);
		
		
		Memur memur2 = new Memur();
		memur2.id=memur2.idAtama();
		memur2.isim="kerem";
		memur2.soyİsim ="Bey";
		memur2.adres="Eskisehir";
		memur2.telefon="123456";
		memur2.saatlikUcret=40;
		memur2.statu="engineer";
		memur2.maas=memur2.maasHesapla(memur2.saatlikUcret);
		
		
		Memur memur3 = new Memur();
		memur3.id=memur3.idAtama();
		memur3.isim="Fatih";
		memur3.soyİsim ="Bey";
		memur3.adres="Eskisehir";
		memur3.telefon="123456";
		memur3.saatlikUcret=20;
		memur3.statu="engineer yardimcisi";
		memur3.maas=memur1.maasHesapla(memur3.saatlikUcret);
		
		
		List<Memur> list  = new  ArrayList<Memur>(Arrays.asList(memur1,memur2,memur3));
		
		
		
		for(Memur test:list) {
			
			System.out.println(test.id+test.isim+test.soyİsim+test.adres+test.telefon+test.saatlikUcret+test.statu+test.maas);
			
				
	

}
}
}
