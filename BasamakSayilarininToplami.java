package patikaUygulamalar;

import java.util.Scanner;

public class BasamakSayilarininToplami {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		
		int sayi;		
		int toplam = 0;
		int gecici;
		
		System.out.println("bir sayı giriniz : ");
		sayi = degerAl.nextInt();
		int sayi2 = sayi;
		
		while (sayi > 0) {
			gecici = sayi % 10 ;
			toplam = toplam+gecici;
			sayi = sayi / 10;
		}
		
		System.out.println(sayi2 + " sayısının basamakları toplamı : " + toplam);

	}

}

//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.