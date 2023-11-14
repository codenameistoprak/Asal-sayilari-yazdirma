import java.util.Scanner;

public class deneme25 {
    public static boolean asalKontrol(int sayi) {
    	
    	for(int i=2; i<sayi;i++) {
    		
    		if(sayi%i==0) {
    			
    			return false;
    		}
    	}
    
          return true;
    }
   
  public static void main(String[]args) {
	 
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Bir sayı girin: ");
	  int deneme= scanner.nextInt();
	
	  System.out.println("1'den " + deneme +"'ye kadar olan asal sayılar");
	  
	  		for(int i =2; i<deneme;i++) {
		   
	  				if(asalKontrol(i)) {
	  					System.out.println(i);
	  }
	  
  }
	 	scanner.close();
}
  
  }