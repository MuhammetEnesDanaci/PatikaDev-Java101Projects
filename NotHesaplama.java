import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
		
		//değişkenler tanımlandı
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("matematik notu giriniz : ");
		mat = degerAl.nextInt();
		
		System.out.print("fizik notu giriniz : ");
		fizik = degerAl.nextInt();
		
		System.out.print("kimya notu giriniz : ");
		kimya = degerAl.nextInt();
		
		System.out.print("türkçe notu giriniz : ");
		turkce = degerAl.nextInt();
		
		System.out.print("tarih notu giriniz : ");
		tarih = degerAl.nextInt();
		
		System.out.print("müzik notu giriniz : ");
		muzik = degerAl.nextInt();
		
		//notların toplamı ve ortalamasının bulunması
		int toplamNot = (mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc = toplamNot/6;
		
		System.out.println("sonuç = "+sonuc );
		
		//son durum çıktısı
		 String durum = (sonuc>=60)? "Sınıfı Geçti" : "Sınıfta Kaldı";
	     System.out.print("Son durum : " + durum);

	}

}
