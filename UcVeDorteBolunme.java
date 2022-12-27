package patikaUygulamalar;

import java.util.Scanner;

public class UcVeDorteBolunme {

	public static void main(String[] args) {
		
		int toplam=0,ortalama=0,adet=0,sayi;
		Scanner degerAl = new Scanner(System.in);
		System.out.println("pozitif bir sayı giriniz : ");
		sayi=degerAl.nextInt();
		
		if (sayi>=0) {
			for (int i = 0; i < sayi; i++) {
				if (i % 3 == 0 && i % 4 == 0) {
					toplam = toplam + i;
					adet++;	
					System.out.println(toplam +" " + i + " "+ adet);
				}
			}
			ortalama = toplam / adet ;
			System.out.println(sayi + " sayısına kadar 3 ve 4 e bölünen sayıların ortalaması : " + ortalama);
		} 
		else {
			System.out.println("hatalı giriş.");

		}

	}

}
