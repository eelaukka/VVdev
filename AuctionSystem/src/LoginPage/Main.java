package LoginPage;
import java.util.Scanner;
import LoginPage.LoginClass;

public class Main {
	
	public static void main(String[] args) {
		LoginClass loginClass = new LoginClass();
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
