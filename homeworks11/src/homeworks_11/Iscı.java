package homeworks_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iscı extends Muhasebe  {
	
	
	public static void main(String [] args) {
		
		Iscı isci1 = new Iscı();
		isci1.id=isci1.idAtama();
		isci1.isim="Aslan";
		isci1.soyİsim ="Bey";
		isci1.adres="Eskisehir";
		isci1.telefon="123456";
		isci1.saatlikUcret=50;
		isci1.statu="supervizor";
		isci1.maas=isci1.maasHesapla(isci1.saatlikUcret);
		
		
		Iscı isci2 = new Iscı();
		isci2.id=isci1.idAtama();
		isci2.isim="Polat";
		isci2.soyİsim ="Alemdar";
		isci2.adres="Almanya";
		isci2.telefon="065432";
		isci2.saatlikUcret=40;
		isci2.statu="engineer";
		isci2.maas=isci2.maasHesapla(isci2.saatlikUcret);
		
		Iscı isci3 = new Iscı();
		isci3.id=isci3.idAtama();
		isci3.isim="Memati";
		isci3.soyİsim ="Bas";
		isci3.adres="Hollanda";
		isci3.telefon="065443";
		isci3.saatlikUcret=420;
		isci3.statu="engineer yardimcisi";
		isci3.maas=isci3.maasHesapla(isci3.saatlikUcret);
		
		
		List<Iscı> list  = new  ArrayList<Iscı>(Arrays.asList(isci1,isci2,isci3));
		
		
		
		for(Iscı test:list) {
			
			System.out.println(test.id+test.isim+test.soyİsim+test.adres+test.telefon+test.saatlikUcret+test.statu+test.maas);
			
			
			
			
			
			
		}
		
	}
 
}
