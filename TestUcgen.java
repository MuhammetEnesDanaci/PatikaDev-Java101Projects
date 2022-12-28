package patikaUygulamalar;

import java.util.Scanner;

public class TestUcgen {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("üçgen kaç sıradan oluşsun : ");
		int sayi = degerAl.nextInt();
		
		for (int i = sayi; i > 0; i--) {
			for (int j = i; j < sayi; j++) {
				System.out.print(" ");
			}			
			for (int k = 0; k < ((2*i)-1); k++) {
				System.out.print("*");
		        //System.out.print(" ");
			}
			System.out.println(" ");
		}
				
	}

}
