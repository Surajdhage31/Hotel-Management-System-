package vegetarian;
import java.util.Scanner;
public class Center {
	void Hotels() {
	Scanner Time=new Scanner(System.in); 
	System.out.println("Enter your choice");
	System.out.println("1.Break-fast,2.Lunch,3.Dinner");
	int choice = Time.nextInt();
	switch(choice) {
	case 1 :{
		Restaurant name = new Restaurant();
		name.Hotel();
	}
	case 2 :
	{
		Restaurant1 name = new Restaurant1();
		name.Hotel2();
	}
	}
}
}
