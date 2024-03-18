package market1;
import java.util.Scanner;
public class Shops {

	public static void main(String[] args) {

 System.out.println("Welcome to Mole");
 System.out.println("Please select your Shops ");
	Scanner scan = new Scanner(System.in);
 System.out.println("1.Cloth Shops"
 		+ "\n2.Jawelry Shops"
 		+ "\n3.vagetable Shops"
 		+ "\n4.Watch Shops"
 		+ "\n5.Footware Shops"
 		+ "\n6.Stationary"
 		+ "\n7.Moals"
 		+ "\n8.Moblie "
 		+ "\n9.Cycle Shops");
 // beka_ri , Sweet, pani_puri shop ,Restaurant,gift center
   int number = scan.nextInt();
   switch(number)
   {
   case 1:
   {   System.out.println("Select your category");
	   System.out.println("1.Ladies Wares"
	   		+ "\n2.Jents Wares"
	   		+ "\n3.kids Wares");
	   int Wares = scan.nextInt();
	   switch(Wares)
	   {
	   case 1 :
	   {
		   System.out.println("hi");
	   }
   }
   }
  
	}

	}
}
