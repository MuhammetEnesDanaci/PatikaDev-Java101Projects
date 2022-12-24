import java.util.Scanner;

public class KitleEndeksiHesaplama {

	public static void main(String[] args) {
		
		/*
		 Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
		 */
		
		
		//değişkenler tanımlandı
		double boy,kilo,indeks;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("boyunuzu metre cinsinden giriniz(Örn:1.85) : ");
		boy = degerAl.nextDouble();
		
		System.out.print("kilonuzu giriniz : ");
		kilo = degerAl.nextDouble();
		
		indeks = (kilo/(boy*boy));
		
		System.out.println("vücut kitle indeksiniz : " + indeks);
	

	}

}
