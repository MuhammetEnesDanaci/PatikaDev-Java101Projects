import java.util.Scanner;

public class KosulluIfadeNotHesaplama {

	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik;
		int toplam=0;
		int dersSayisi=0;
		
		Scanner degerAl = new Scanner(System.in);
		

		System.out.print("matematik notu giriniz : ");
		mat = degerAl.nextInt();
		if (mat>=0 && mat<=100) {
			toplam = toplam+mat;
			dersSayisi++;
		}
		
		System.out.print("fizik notu giriniz : ");
		fizik = degerAl.nextInt();
		if (fizik>=0 && fizik<=100) {
			toplam = toplam+fizik;
			dersSayisi++;
		}
		
		System.out.print("türkçe notu giriniz : ");
		turkce = degerAl.nextInt();
		if (turkce>=0 && turkce<=100) {
			toplam = toplam+turkce;
			dersSayisi++;
		}
		
		System.out.print("kimya notu giriniz : ");
		kimya = degerAl.nextInt();
		if (kimya>=0 && kimya<=100) {
			toplam = toplam+kimya;
			dersSayisi++;
		}
		
		System.out.print("müzik notu giriniz : ");
		muzik = degerAl.nextInt();
		if (muzik>=0 && muzik<=100) {
			toplam = toplam+muzik;
			dersSayisi++;
		}	
		
		double ortalama = toplam/dersSayisi;
		
		if (ortalama < 55) {
			System.out.println("sınıfta kaldınız.");
		} 
		else {
			System.out.println("tebrikler sınıfı geçtiniz.");
		}
		System.out.println("ortalamanız : " + ortalama);
		
	}

}
