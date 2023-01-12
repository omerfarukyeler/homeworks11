package homeworks_11;

public class Muhasebe extends Personel {

	int saatlikUcret;
	String statu;
	double maas;
	
	public double maasHesapla(int saaatlikUcret) {
		
		this.maas=saatlikUcret*8*30;
		return this.maas;
	}
	
}
