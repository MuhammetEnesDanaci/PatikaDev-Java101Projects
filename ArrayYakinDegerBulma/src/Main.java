import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		int[] list = {15,12,788,1,-1,-778,2,0};
		System.out.println("bir sayı giriniz : ");
	    int sayi = degerAl.nextInt();
	    
	    int[] geciciList = new int[list.length];
	    
	    for (int i = 0; i < list.length; i++) {
			geciciList[i] = list[i];
		}
	    Arrays.sort(geciciList);
        int min = geciciList[0];
        int max = geciciList[geciciList.length-1];
        
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Geçici Dizi : " + Arrays.toString(geciciList));

        for (int i : geciciList) {
            if (i > min && i< sayi) {
                min = i;
            }
            if (i < max && i>sayi) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
	}

}
