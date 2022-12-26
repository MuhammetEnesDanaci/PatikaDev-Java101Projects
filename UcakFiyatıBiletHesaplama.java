import java.util.Scanner;

public class UcakFiyatıBiletHesaplama {

	public static void main(String[] args) {
		
		int yas,mesafe,yolculukTipi;
		double fiyat;
		
		Scanner degerAl = new Scanner(System.in);
		
		System.out.println("Yaşınızı giriniz : ");
		yas=degerAl.nextInt();
		
		System.out.println("Mesafe giriniz(km) : ");
		mesafe=degerAl.nextInt();
		
		System.out.println("Yolculuk tipi giriniz(1-Tek Yön, 2-Gidiş/Dönüş) : ");
		yolculukTipi=degerAl.nextInt();		
		
		fiyat=mesafe*0.1;
		
		//girilen değerlerin sıfırdan büyük olması koşulu
		if (yas>0 && mesafe>0 && (yolculukTipi==1 || yolculukTipi==2)) {
			//yaş indirimi
			if (yas<12) {
				fiyat=fiyat - (fiyat*0.5);
			} 
			else if (yas >=12 && yas<=24) {
				fiyat = fiyat -( fiyat*0.1);
			}
			else if (yas >65) {
				fiyat = fiyat -( fiyat*0.3);
			}
			
			if (yolculukTipi == 2) {
				fiyat = 2 * (fiyat -( fiyat*0.2));
			}
			
			System.out.println("toplam tutar : " + fiyat + " TL.");
		} 
		else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		
		

	}

}
