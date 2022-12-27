package patikaUygulamalar;

import java.util.Scanner;

public class DordunKatlarınıYazdirma {

	public static void main(String[] args) {
		
		int sayi;
		int toplam = 0;
		Scanner degerAl = new Scanner(System.in);
		
		do {
			System.out.print("bir sayı giriniz : ");
			sayi = degerAl.nextInt();
			
			if(sayi % 4 == 0) {
				toplam = toplam + sayi;
			}
			
		} while (sayi % 2 == 0);
		
		System.out.println("toplam : " + toplam);

	}

}

/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen 
değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/