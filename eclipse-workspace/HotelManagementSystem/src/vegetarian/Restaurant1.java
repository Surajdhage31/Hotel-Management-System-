package vegetarian;
import java.util.Scanner;
public class Restaurant1 {
	void Hotel2() {
		System.out.println("Welcome to our pure vegi Restaurant");
		System.out.println("Menu");
		System.out.println("1.North Indian");
		System.out.println("2.South Indian");
		System.out.println("3.Punjabi");
		System.out.println("4.Maharastrian");
		Scanner Dish = new Scanner(System.in);
		int item = Dish.nextInt();
		switch (item) {
		case 1: {
			System.out.println("#There are two dish Select which you want#");
			System.out.println(" **Food items in the dish as follow** ");
			System.out.println("1.Koki(Paratha)\nDal Makhani" + "\nVag palak gravy\nPanner tikka\nRice\nRaita\nJamun\n");
			System.out.println("2.Boondi raita \nAloo Bhindi fry\nJeera Rice" + "\nGreen Moong Dal\rGobi Paratha");
			int dish = Dish.nextInt();
			if (dish == 1) {
				int price = 749;
				System.out.println("Please pay your Dish Price = " + price);
				int rate = Dish.nextInt();
				if (rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}

			} else {
				int price = 549;
				System.out.println("Please pay your Dish price  = " + price);

			}
			break;
		}
		case 2: {
			System.out.println("#There are two dish Select which you want#");
			System.out.println(" **Food items in the dish as follow** ");
			System.out.println("1.Mango rice\n" + "Banana stem mor kootu \r\n" + "Masala vadai\n");
			System.out.println("2.Puli sadam\n" + "Curd rice\n" + "Mix vegetable kootu\n" + "cabbage vada\n"
					+ "Mor milagai\n" + "koozd vadam");
			int dish = Dish.nextInt();
			if (dish == 1) {
				int price = 199;
				System.out.println("Please pay your Dish Price = " + price);
				int rate = Dish.nextInt();
				if (rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}

			} else {
				int price = 299;
				System.out.println("Please pay your Dish price  = " + price);
				int Rate = Dish.nextInt();
				if (Rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}
			}
			break;
		}
		case 3: {
			System.out.println("#There are two dish Select which you want#");
			System.out.println(" **Food items in the dish as follow** ");
			System.out.println("1.Amritsari aloo kulcha\r\n" + "Dal tadka\n" + "Punjabi chole\n" + "Dahi kadhi\n"
					+ "Jeera rice\n" + "Sweet lassi\n");
			System.out.println("2.Boondi Raitha\r\n" + "Fresh Salad\n" + "Aloo Bhindi Subzi\r\n"
					+ "Matar Paneer Masala\r\n" + "Paneer Butter Masala\r\n" + "Dal Fry\r\n" + "Jeera Rice\r\n"
					+ "Kasuri Methi Ajwain Phulkas\r\n" + "Plain Phulkas\r\n" + "Carrot Seviyan Halwa");
			int dish = Dish.nextInt();
			if (dish == 1) {
				int price = 699;
				System.out.println("Please pay your Dish Price = " + price);
				int rate = Dish.nextInt();
				if (rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}

			} else {
				int price = 699;
				System.out.println("Please pay your Dish price  = " + price);
				int Rate = Dish.nextInt();
				if (Rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}
			}
			break;

		}
		case 4: {
			System.out.println("#There are two dish Select which you want#");
			System.out.println(" **Food items in the dish as follow** ");
			System.out.println("1.Panner Masala\n");
			System.out.println("Kadhi \n" + "Bhoplya Cha Bharit \n" + " Maharashtrian Multigrain Thalipeeth\n");
			System.out.println("2. Khandeshi Dal\n" + " Maharashtrian Tindora Sabzi\n " + " Phulka");
			int dish = Dish.nextInt();
			if (dish == 1) {
				int price = 299;
				System.out.println("Please pay your Dish Price = " + price);
				int rate = Dish.nextInt();
				if (rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}

			} else {
				int price = 299;
				System.out.println("Please pay your Dish price  = " + price);
				int Rate = Dish.nextInt();
				if (Rate == price) {
					System.out.println("Thanks for paying price " + price);
				} else {
					System.out.println("Not match price");
				}
			}
			break;
		}

		}
	}

}
