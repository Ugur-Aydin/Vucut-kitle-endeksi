import java.util.*;

public class vki {

	public static void main(String[] args) {
		
			
	/*Ýngiliz ölçü birimleri ile iþlem yaparken belirli yerlere virgül koymayý unutmayýnýz.Aksi takdirde program hata verecektir.*/	
		
		Scanner kb = new Scanner(System.in);
		String olcu;
		double boy;
		double kilo;
	    
		
		System.out.println("Vücut kitle endeksi hesaplama programýna hoþgeldiniz.Lütfen kullanacaðýnýz ölçü birimini seçiniz.");
		System.out.println("Metrik,Ýngiliz ölçü birimi");
		System.out.print(">");
		olcu = kb.nextLine();
		
		if(olcu.equalsIgnoreCase("Metrik")){
			
			System.out.println("Boy ölçünüzü giriniz:");
			System.out.print(">");
			boy =kb.nextDouble();
			
			System.out.println("Kilo deðerinizi giriniz:");
			System.out.print(">");
			kilo = kb.nextDouble();
			
			System.out.println("Vücut kitle endeksiniz:");
		
			System.out.println(kilo	/(boy*boy) );
		}
		
		else {
			
			System.out.println("Boy deðerlerinizi fit ve inç cinsinden giriniz:");
			System.out.print(">");
			boy = kb.nextDouble();
			
			System.out.println("Kilonuzu pound cinsinden giriniz.");
			System.out.print(">");
			kilo = kb.nextDouble();
			
			double boy1 = boy * 30.48;
			double kilo1 = kilo * 0.45;
			System.out.println("Vücut kitle endeksiniz:");
			System.out.println(((kilo1)/(boy1*boy1))*10000);
			
		}

		kb.close();
   
  
	}}

