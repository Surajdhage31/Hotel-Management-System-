package vegetarian;
import java.util.Scanner;
public class Restaurant1 {
	void Hotel2() {
		System.out.println("Menu");
		System.out.println("1.North Indian");
		System.out.println("2.South Indian");
		System.out.println("3.Punjabi");
		System.out.println("4.Maharastrian");
		Scanner Dish = new Scanner(System.in);
		int item = Dish.nextInt();
		switch (item) {
		case 1: {
			System.out.println("There are two dish Select which you want");
			System.out.println(" Food items in the dish as follow ");
			System.out.println("1.Koki(Paratha)\nDal Makhani"
					+ "\nVag palak gravy\nPanner tikka\nRice\nRaita\nJamun\n");
		 System.out.println("2.Boondi raita \nAloo Bhindi fry\nJeera Rice"
		 		+ "\nGreen Moong Dal\rGobi Paratha");
		 break ;
		}
		case 2:
		{
			System.out.println("1.Mango rice\n"
					+ "Banana stem mor kootu \r\n"
					+ "Masala vadai\n");
			System.out.println("2.Puli sadam\n"
					+ "Curd rice\n"
					+ "Mix vegetable kootu\n"
					+ "cabbage vada\n"
					+ "Mor milagai\n"
					+ "koozd vadam");
			break;
		}
		case 3:
		{
			System.out.println("1.Amritsari aloo kulcha\r\n"
					+ "Dal tadka\n"
					+ "Punjabi chole\n"
					+ "Dahi kadhi\n"
					+ "Jeera rice\n"
					+ "Sweet lassi\n");
			System.out.println("2.Boondi Raitha\r\n"
					+ "Fresh Salad\n"
					+ "Aloo Bhindi Subzi\r\n"
					+ "Matar Paneer Masala\r\n"
					+ "Paneer Butter Masala\r\n"
					+ "Dal Fry\r\n"
					+ "Jeera Rice\r\n"
					+ "Kasuri Methi Ajwain Phulkas\r\n"
					+ "Plain Phulkas\r\n"
					+ "Carrot Seviyan Halwa");
		}
		case 4 :
		{
			System.out.println("1.Panner Masala\n");
		}
		
		}
	}

}
