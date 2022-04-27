import java.util.Scanner;
public class EmailAdministration {
	public static void main(String[] args) {
		//use get methods to show, name, email and mailbox
		NewEmailAccount email_Admin = new NewEmailAccount("Muaad", "Ahmed", "Accounting", "Weyit");
		email_Admin.setEmail(email_Admin.email_create("Muaad", "Ahmed", "Accounting", "Weyit"));
		System.out.println("Fullname: " + email_Admin.getFirstname() + " " + email_Admin.getLastname());
		System.out.println("Email: " + email_Admin.getEmail());
		System.out.println("Password: " + email_Admin.generate_password());
		System.out.print("Change password ?(Yes/No)");
		Scanner scan_pass = new Scanner(System.in);
		String change_pass = scan_pass.nextLine();
		if (change_pass.equals("Yes") || change_pass.equals("yes")) {
			email_Admin.setPassword(email_Admin.generate_password());
			System.out.println("Password: " + email_Admin.getPassword());
		}
		email_Admin.setMailBoxCap(250);
		System.out.println("Mail Box Capacity: " + email_Admin.getMailBoxCap() + "mb");
	}
}
