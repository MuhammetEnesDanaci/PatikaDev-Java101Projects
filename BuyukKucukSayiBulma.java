package patikaUygulamalar;

import java.util.Scanner;

public class BuyukKucukSayiBulma {

	public static void main(String[] args) {
		
		int adet,sayi,buyuk=0,kucuk=0;
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("kaç tane sayı girilecek : ");
		adet = degerAl.nextInt();
		
		for (int i = 1; i <= adet; i++) {
			
			System.out.print(i + ". sayıyı giriniz : ");
			sayi = degerAl.nextInt();
			
			if (i==1) {
				kucuk = sayi;
				buyuk = sayi;
			}
			if (sayi>buyuk) {
				buyuk = sayi;
			} 			
			
			if (sayi<kucuk) {
				kucuk = sayi;
			} 
		}
		
		System.out.println("en büyük sayi : " + buyuk);
		System.out.println("en küçük sayi : " + kucuk);
		

	}

}
