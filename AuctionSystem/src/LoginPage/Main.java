package loginPage;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import loginPage.User;

public class Main {
	
	public static void main(String[] args) {
		Date startDate = new Date();
		Auction auction1 = new Auction(0, null, null, 0, null, null);
		Item item1 = new Item(0, "Ford Focus", 100.0, null, null, null, null);
		List<Item> itemList = null;
		Category category1 = new Category(1, "Cars", itemList);
		User loginClass = new User();
		Scanner input = new Scanner(System.in);
		
		String user, pass;
		
		System.out.print("Enter your username: ");
		user = input.nextLine();
		System.out.print("Enter your password: ");
		pass = input.nextLine();
		
		loginClass.setmUserName(user);
		loginClass.setmPassword(pass);
		
		if (loginClass.userRegistered()) {
			System.out.print("Welcome");
		}else {
			System.out.print("Invalid User/pass combination");
		}
	}
}
