package vegetarian;

import java.util.Scanner;

public class Restaurant {

	void Hotel() {
		 Scanner menu = new Scanner(System.in); 
			System.out.println("Menu");
			System.out.println("1.Tea");
			System.out.println("2.Coffee");
			System.out.println("3.Pohe");
			System.out.println("4.Vada pav");
			System.out.println("5.Pav bhaji");
			System.out.println("6.Dosa");
			System.out.println("Pleses order your favourite item\n");
			int Menu = menu.nextInt();
			switch (Menu) {
			case 1: {
				System.out.println(" Please pay for Tea Rs 10/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 10;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \nPaid Rs : " + money
						: "Not match price \n Please pay for " + quantity + " Rs : " + money;

				System.out.println(Result);

				break;
			}
			case 2: {
				System.out.println(" Please pay for Coffee Rs 15/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 15;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \nPaid Rs : " + money
						: "Not match price \n Please pay for " + quantity + " Rs : " + money;
				System.out.println(Result);
				break;
			}
			case 3: {
				System.out.println("Please pay for Pohe Rs 25/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 25;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \n Paid Rs:" + money
						: "Not match price \n Please pay for " + quantity + " Rs : " + money;
				System.out.println(Result);
				break;
			}
			case 4: {
				System.out.println("Please pay for Vada pav Rs 15/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 15;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \nPaid Rs : " + money
						: "Not match price \n Please pay for " + quantity + " Rs :" + money;
				System.out.println(Result);
				break;
			}
			case 5: {
				System.out.println(" Please pay for Pav bhaji Rs 40/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 40;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money  = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \nPaid Rs : " + money
						: "Not match price \n Please pay for " + quantity + " Rs : " + money;
				System.out.println(Result);
				break;
			}
			case 6: {
				System.out.println(" Please pay for Dosa Rs 50/per");
				System.out.println("Please enter the quantity");
				int quantity = menu.nextInt();
				int price = 50;
				int Total = price * quantity;
				System.out.println("Please pay " + Total);
				int money = menu.nextInt();
				String Result = (Total == money) ? "Thank for visit \n Visit again \nPaid Rs : " + money
						: "Not match price \n Please pay for " + quantity + " Rs : " + money;
				System.out.println(Result);
				break;
			}
			}
		}
		}
		

	

