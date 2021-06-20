package weightIndex;
import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		double size;
		double weight;
		double vki;
	
		
		
		
		Scanner scanner = new Scanner(System.in); 
			System.out.println("Lütfen boyunuzu giriniz :");
			size=scanner.nextDouble();
			System.out.println("Lütfen kilonuzu giriniz :");
		    weight=scanner.nextDouble();
		    vki=weight/(size*size);
			System.out.println("Vücut Kitle Ýndeksiniz :" +vki);
			
			
		 
	}
}
	
