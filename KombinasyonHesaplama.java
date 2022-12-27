package patikaUygulamalar;

import java.util.Scanner;

public class KombinasyonHesaplama {

	public static void main(String[] args) {
		int n , r ;
		Scanner degerAl = new Scanner(System.in);
		
		System.out.println("N Değerini Giriniz");
        n=degerAl.nextInt();
        
        System.out.println("R Değerini Giriniz");
        r=degerAl.nextInt();
        
        int faktoriyel_1=1;
        int faktoriyel_2=1;
        int faktoriyel_3=1;
        int fark=n-r;
        
        if (n > 0 && r>0) {
        	for(int i=1;i<=n;i++){
                
                faktoriyel_1=faktoriyel_1*i;
            }
            System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);
            
            for(int j=1;j<=r;j++){
                
                faktoriyel_2=faktoriyel_2*j;
            }
            System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);
            
            for(int k=1;k<=fark;k++){
                
                faktoriyel_3=faktoriyel_3*k;
            }
            System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);
            
            int carpim=faktoriyel_2*faktoriyel_3;
            int kombinasyon=faktoriyel_1/carpim;
            
            System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
		} 
        else {
        	System.out.println("negatif sayı girişi yapılmaz");
		}
    
	}

}

/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/