package patikaUygulamalar;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		int toplam=0;
		
		System.out.print("bir sayı giriniz : ");
		int sayi=degerAl.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}			
		}
		
		if (toplam == sayi) {
			System.out.println(sayi + " sayısı mükemmel sayıdır.");
		} else {
			System.out.println(sayi + " sayısı mükemmel sayı değildir.");
		}
		
		
	}

}
