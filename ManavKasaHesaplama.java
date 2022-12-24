import java.util.Scanner;

public class ManavKasaHesaplama {

	public static void main(String[] args) {
		
		/*
		 Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
		 */
		
		
		//değişkenler tanımlandı
		double armut,elma,domates,muz,patlıcan,toplam;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("Armut Kaç Kilo ? : ");
		armut = degerAl.nextDouble();

		System.out.print("Elma Kaç Kilo ? : ");
		elma = degerAl.nextDouble();

		System.out.print("Domates Kaç Kilo ? : ");
		domates = degerAl.nextDouble();

		System.out.print("Muz Kaç Kilo ? : ");
		muz = degerAl.nextDouble();

		System.out.print("Patlıcan Kaç Kilo ? : ");
		patlıcan = degerAl.nextDouble();
		
		toplam = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.0);
		
		System.out.println("Toplam tutar : " + toplam);
		
	}

}
