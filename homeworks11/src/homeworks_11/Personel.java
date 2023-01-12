package homeworks_11;

public class Personel {
	
	int id ;
	String isim;
    String soyİsim;
    String adres;
    String telefon;
    static int sayac = 123456;
    
    public int idAtama() {
    	
    	this.id=sayac++;
    	return this.id++;
    }
}
