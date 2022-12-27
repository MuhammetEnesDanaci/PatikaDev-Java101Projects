package patikaUygulamalar;

import java.util.Scanner;

public class UstluSayiHesaplama {

	public static void main(String[] args) {
		int sayi,kuvvet;
		int sonuc=1;
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("sayı giriniz : ");
		sayi=degerAl.nextInt();
		
		System.out.print("kuvvet giriniz : ");
		kuvvet=degerAl.nextInt();		
		
		for (int i = 1; i <= kuvvet; i++) {
			sonuc = sonuc*sayi;
		}
		
		System.out.println(sayi + " sayısının " + kuvvet + ". kuvveti : " +sonuc);
	}

}
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.