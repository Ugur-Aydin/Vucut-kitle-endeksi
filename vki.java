import java.util.*;

public class vki {

	public static void main(String[] args) {
		
			
	/*�ngiliz �l�� birimleri ile i�lem yaparken belirli yerlere virg�l koymay� unutmay�n�z.Aksi takdirde program hata verecektir.*/	
		
		Scanner kb = new Scanner(System.in);
		String olcu;
		double boy;
		double kilo;
	    
		
		System.out.println("V�cut kitle endeksi hesaplama program�na ho�geldiniz.L�tfen kullanaca��n�z �l�� birimini se�iniz.");
		System.out.println("Metrik,�ngiliz �l�� birimi");
		System.out.print(">");
		olcu = kb.nextLine();
		
		if(olcu.equalsIgnoreCase("Metrik")){
			
			System.out.println("Boy �l��n�z� giriniz:");
			System.out.print(">");
			boy =kb.nextDouble();
			
			System.out.println("Kilo de�erinizi giriniz:");
			System.out.print(">");
			kilo = kb.nextDouble();
			
			System.out.println("V�cut kitle endeksiniz:");
		
			System.out.println(kilo	/(boy*boy) );
		}
		
		else {
			
			System.out.println("Boy de�erlerinizi fit ve in� cinsinden giriniz:");
			System.out.print(">");
			boy = kb.nextDouble();
			
			System.out.println("Kilonuzu pound cinsinden giriniz.");
			System.out.print(">");
			kilo = kb.nextDouble();
			
			double boy1 = boy * 30.48;
			double kilo1 = kilo * 0.45;
			System.out.println("V�cut kitle endeksiniz:");
			System.out.println(((kilo1)/(boy1*boy1))*10000);
			
		}

		kb.close();
   
  
	}}

