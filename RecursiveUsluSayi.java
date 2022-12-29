import java.util.Scanner;

public class RecursiveUsluSayi {
	
	public static int ustAlma(int taban,int usdeger)	{
		if (usdeger==0) {
			return 1;
		}
		else if(taban==1) {
			return 1;
		}
		else {
			return taban*ustAlma(taban, usdeger-1);
		}

	}

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("Taban değeri giriniz :");
        int taban = degerAl.nextInt();
        System.out.print("Üs değeri giriniz :");
        int ust = degerAl.nextInt();
		
		System.out.println(ustAlma(taban, ust));

	}

}
