import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		
		int anapara;
		double faizTutarı, faziliToplamTutar;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("ana para giriniz : ");
		anapara = degerAl.nextInt();
		
		//ana para -1000 arası ize faiz %18, büyükse %8
		
		String durum = (anapara<=1000)? "anapara = "+anapara+
				"\nfaiz tutarı = "+(anapara*0.18)+
				"\nToplam para = "+(anapara+(anapara*0.18)) 
				: "anapara = "+anapara+"\nfaiz tutarı = "+(anapara*0.08)+"\nToplam para = "+(anapara+(anapara*0.08));
		
		System.out.println(durum);
	}

}
