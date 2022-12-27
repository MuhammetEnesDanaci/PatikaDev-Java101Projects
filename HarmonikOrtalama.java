package patikaUygulamalar;

import java.util.Scanner;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		
        System.out.print("Bir sayi giriniz : ");
        
        int n = degerAl.nextInt();
        double toplam=0;
        
        for (int i=1 ; i<=n ; i++){        	
        	toplam = (toplam+(1/(double)i));
        }
        
        System.out.println(toplam);

	}

}

