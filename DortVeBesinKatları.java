package patikaUygulamalar;

import java.util.Scanner;

public class DortVeBesinKatları {

	public static void main(String[] args) {
		int sayi;
		Scanner degerAl = new Scanner(System.in);
		System.out.print("bir sayı giriniz : " );
		sayi = degerAl.nextInt();
		
		System.out.print("4'ün katları ");
		for (int i = 1; i <= sayi; i*=4){
            System.out.print(i + " ");
        }
		System.out.println("");
		System.out.println("---------------");
		
		System.out.print("5'in katları ");
        // 5
        for (int i = 1; i <= sayi; i*=5){
            System.out.print(i + " ");
        }

		
		
	}

}
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program