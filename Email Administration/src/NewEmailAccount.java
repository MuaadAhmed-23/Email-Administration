import java.util.Scanner;
import java.util.Random;
public class NewEmailAccount extends EmailAdministration {
	private String firstname;
	private String lastname;
	private String department;
	private String company;
	private String password;
	private int mailBoxCap;
	private String email;
	private int len = 7;
	private String random_char_alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/";
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = generate_password();
	}
	
	public int getMailBoxCap() {
		return mailBoxCap;
	}

	public void setMailBoxCap(int mailBoxCap) {
		this.mailBoxCap = mailBoxCap;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public NewEmailAccount(String firstname, String lastname, String department, String company) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.company = company;
		this.email = email_create(firstname, lastname, department, company);
	}
	
	public String email_create(String fname, String lname, String dep, String com) {
		String actual_email = fname + "." + lname + "@" + com + "." + dep + "." + "com";
		return actual_email;
	}
	
	public String generate_password() {
		String result = "";
		Random r = new Random();
		for(int i = 0; i < len; i++) {
			int index = r.nextInt(random_char_alph.length());
			result += random_char_alph.charAt(index);
		}
		return result;
	}
}