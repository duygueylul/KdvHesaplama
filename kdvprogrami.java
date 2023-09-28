package proje_2;



import java.util.Scanner;
public class kdvprogrami {

	public static void main(String[] args) {
		double tutar, KdvFiyati, kdv = 0.18;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ürünün tutarını giriniz: ");
		tutar = input.nextDouble();
		KdvFiyati = tutar + (tutar*kdv);
		System.out.println("Ürünün kdv'li fiyatı: " + KdvFiyati);
		

	}

}
